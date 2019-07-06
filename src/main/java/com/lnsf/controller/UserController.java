package com.lnsf.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lnsf.entities.Photo;
import com.lnsf.entities.PhotoExample;
import com.lnsf.entities.User;
import com.lnsf.entities.UserExample;
import com.lnsf.entities.UserExample.Criteria;
import com.lnsf.entities.UserInformation;
import com.lnsf.entities.UserInformationExample;
import com.lnsf.service.PhotoService;
import com.lnsf.service.UserInformationService;
import com.lnsf.service.UserService;
import com.lnsf.util.PageUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;



@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
     
	@Autowired 
	private UserInformationService userInformationService; 
	@Autowired
	private PhotoService photoService;
	
	/**
	 * 向用户登录页面跳转  
	 */
	
	  @RequestMapping(value = "login",method = RequestMethod.GET) 
	  public String toLogin() { 
		  return "login";
	  }
	 
	/**
	 * 用户注册页面跳转
	 * @return
	 */
	
	  @RequestMapping(value = "register",method = RequestMethod.GET) 
	  public String toRegister() { 
		  return "register";
	  }
	  /**
	   * 出现错误返回错误交给ajax处理
	   * @return
	   */
	@RequestMapping("error")
	public String Error() {
		return "error";
	}
	 /**
	  * 登录到管理员页面
	  * @return
	  */
	 @RequestMapping("adminUser")
	 public String adminUser(HttpServletRequest request) {
	 User user = (User) request.getSession().getAttribute("user");
	  
	 if(user!=null) {
	 if(user.getPower()==1)
	  {
	  return "admin/index"; 
	     }else {
	       return "redirect:people"; 
	 }
	 }
	 return "redirect:login";
	}
	
	/**
	 * 登录到vip页面
	 * @return
	 */
	@RequestMapping("vipPeople")
	public String vippPeople() {
		
		return "vippeople";
		
	}
	/**
	 * 登录到普通用户页面
	 * @return
	 */
	@RequestMapping(value="people")
	public String people(HttpServletRequest request) {
		request.getSession().getAttribute("user");
		System.out.println("people");
		return "index";
	}
	
	
	 /**
	  * 用户名检测
	  */
	    @ResponseBody
	    @RequestMapping("userNameCheck")
	  public String userNameCheck(String username) {
	     User user =new User();
	     user =userService.selectByUsername(username);
	     if(user!=null) {
	      return "exist";
	     }
	     return "enable";
	    }
	
	
	
	
	
	/**
	 * 用户登录
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "loginUser",method = RequestMethod.POST)
	public String login(String username,String password,HttpServletRequest request) throws Exception {
		User user =new User();
		UserInformation userInformation=new UserInformation();
		//获取用户名密码
		UserExample userExample =new UserExample();
		String username2 =	null;
		String password2 =null;
		Integer power =null;
		Integer uid=null;
		 HttpSession session=request.getSession(); 
		//指定查询条件 
		userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		 
		List<User> list =userService.selectByExample(userExample);
		for (User user2 : list) {
		 username2 =	user2.getUsername();
		 password2 =	user2.getPassword();
		 power    =   user2.getPower();
		 uid     =    user2.getUid();
		}
		  //从数据库中获取对用户名和密码后进行判断
		if(username!=null&&username.equals(username2)&&password!=null&&password.equals(password2)) {
			//将用户对象添加到Session中
			user.setLogintime(new Date());
			user.setUsername(username2);
			user.setPassword(password2);
			user.setPower(power);
			user.setUid(uid);
			 session.setAttribute("user", user); 
			 //获取用户信息对象
			 userInformation= userInformationService.selectByPrimaryKey(uid);
			 session.setAttribute("userInformation", userInformation);
			 
			//重定向到主页面的跳转方法
			if(1==power) {
			 return "adminUser";
			}
			if(2==power) {
				return "people";
			}
			if(3==power) {
				return "vipPeople";
			}
		}else {
		 return "errorbyZHMM";
	}
		return password2;
	}
	
	 /**
	  * 用户注册
	  * @param username
	  * @param password
	  * @param user
	  * @param userInformation
	  * @param request
	  * @return
	  * @throws Exception
	  */
	  @ResponseBody  
	  @RequestMapping(value = "register",method = RequestMethod.POST)  
	  public String  register(String username,String password,User user,UserInformation userInformation,HttpServletRequest request,String confirm_password) throws Exception {
		  System.out.println(password.equals(confirm_password));
		  String email =userInformation.getEmail();
		  String tel =userInformation.getTel();
		  String address =userInformation.getAddress();
		  String emailCheckString ="^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		  String telCheckString ="^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
		  Pattern regexEmail = Pattern.compile(emailCheckString);
		  Matcher matcherEmail = regexEmail.matcher(email);
		  Pattern regexTel = Pattern.compile(telCheckString);
		  Matcher matcherTel = regexTel.matcher(tel);
		   Boolean  flagTel = matcherTel.matches();
		    Boolean  flagEmail = matcherEmail.matches();
			   if(username==""||password==""||username==null||password==null||email==""||tel==""||address=="")
				  {
					  return "badvalue"; 
				  }else if(username.length()<6||password.length()<6) {
					  return "lessvalue"; 
				  }
				  else if(password.equals(confirm_password)!=true)
				  {
					  return "passwordnottrue"; 
				  }else if(flagEmail!=true) {
					  return "emailisnottrue";
				  }else if(flagTel!=true) {
					  return "telisnotrue";
				  }
				  int value =userService.register(username, password);
				  if(value != -1) {
					  UserInformationExample userInformationExample = new UserInformationExample();
					  userInformation.setUid(value);
					  user.setUid(value);
					  user.setPower(2);
					  userInformationService.updateByPrimaryKeySelective(userInformation);
					  request.getSession().setAttribute("user", user);
						 //获取用户信息对象
						 userInformation= userInformationService.selectByPrimaryKey(value);
						 request.getSession().setAttribute("userInformation", userInformation);
					  return "people";
				    }else {
				    	return "error"; 
				    }
	  }
	 


	/**
	 * 用户退出清除session
	 * @param session
	 * @return
	 */
	@RequestMapping(value="logOut")
	public String logOut(HttpSession session) {
		User user = (User) session.getAttribute("user");
		user.setLoginouttime(new Date());
		userService.updateByPrimaryKeySelective(user) ;
		session.invalidate();
		return  "login";
	}
	/**
	 * 条件查询
	 * @return
	 */
	@RequestMapping("selectUserAdmin") 
	public ModelAndView selectByExample() {
		ModelAndView  modelAndView =new ModelAndView("admin/adminuser");
		List<User> list =userService.selectByExample(null);
		  modelAndView.addObject("user",list); 
		  return modelAndView;
	}
	
  /**
   * 管理员条件插入
   * @param user
   * @return
   */
	@RequestMapping("insertUserAdmin")
	public String insertSelective(User user) {
		Integer result =userService.insertSelective(user);
		if(result>0) {
			return "selectUserAdmin";
		}else {
			return "error";
		}
	}
	
	/**
	 * 管理员对于uid删除
	 * @param uid
	 * @return
	 */
	/*@RequestMapping("deleteUserAdmin") 
	public String deleteByPrimaryKey(Integer uid) {
		
		Integer result =userService.deleteByPrimaryKey(uid);
		  if(result>0) {
				return "redirect:adminUser_crud";
			}else {
				return "error";
			}
	}*/
	/**
	 * 管理员条件更新
	 *
	 * @param user
	 * @return
	 */
/*	@RequestMapping("updateUserAdmin") 
	public String updateByPrimaryKeySelective(User user) {
		Integer result =userService.updateByPrimaryKeySelective(user);
		  if(result>0) {
				return "redirect:adminUser";
			}else {
				return "error";
			}
	}*/
	/**
	 * 用户修改密码
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping("updateUser") 
	public String updateByPrimaryKeySelective(String password,HttpServletRequest request) {
		User user =(User) request.getAttribute("user");
		user.setPassword(password);
		Integer result =userService.updateByPrimaryKeySelective(user);
		  if(result>0) {
				return "selectUserAdmin";
			}else {
				return "error";
			}
	}
	/**
	 * 管理员批量删除
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping("adminBatchdeleteUser") 
	public String adminBatchdeleteUser(@RequestParam("arr")Integer[] arr) {
		for(int i=0;i<arr.length;i++) {
			userService.deleteByPrimaryKey(arr[i]);	
		}
		return "redirect:adminUser_crud";

	}
	
	
	/**
	 * 页面跳转
	 * @return
	 */
		@RequestMapping(value="adminUser_crud" , method=RequestMethod.GET)
	public String getUserByPage( ){
		return "admin/adminuser";	
	}
	
		/**
	      *  User分页
	      */
	@ResponseBody
	@RequestMapping(value="adminUser_crud"  , method=RequestMethod.POST)
	public Map<String,Object> getUserByPage(@RequestParam("currPage") int currentPage){
		PageUtil<User> pageUser =userService.findByPage(currentPage);
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("pageUser", pageUser);		
		return map;	
	}
	/**
	 * People用户修改自己的密码
	 */
	@RequestMapping("alertUserByPassword")
	public String alertUserByPassword() {
		return "alertuserbypassword";
	}
	/**
	 * 获取session的值
	 */
	@ResponseBody
	@RequestMapping("getUserSession")
	public Map<String, Object> getUserSession(HttpServletRequest request ){
        Map<String, Object> map  =new HashMap<String, Object>();
        Photo photo=null;
        UserInformation userInformation=null;
        User user =(User) request.getSession().getAttribute("user");
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        example.getOredCriteria().add(criteria);
        List<User> user2 = userService.selectByExample(example);
        for (User user3 : user2) {
        	 map.put("user",user3);
        	System.out.println("huangrunzhi输出uid："+user3.getUid());
        	 userInformation = userInformationService.selectByPrimaryKey(user3.getUid());
        	 System.out.println("huangrunzhi输出pid："+userInformation.getHeadportrait());
             if(userInformation.getHeadportrait()!=null){
             	photo	= photoService.selectByPrimaryKey(userInformation.getHeadportrait());
             }
             map.put("user3", user3);
		}
        map.put("userIn", userInformation);
        map.put("photo", photo);
/*        System.out.println("huangrunzhi输出图片路径"+photo.getPhotourl());*/
		return map;	
	}
	@RequestMapping(value="adminuser_crud" , method=RequestMethod.GET)
	public String getUserSession( ){
		return "admin/adminuser_crud";	
	}
	/**
	 * huangrunzhiIn
	 *查看个人信息
	 */
	@RequestMapping("informationById")
	public String informationById(HttpServletRequest request ){
		User user =(User) request.getSession().getAttribute("user");
		System.out.println("huangrrnzhi输出用户名:"+user.getUsername());
		return "admin/informationById";	
	}
	/**
	 * 验证密码
	 */
	@ResponseBody
	@RequestMapping("checkUserPassword")
		public String checkUserPassword(HttpServletRequest request,String password){
		User user=(User) request.getSession().getAttribute("user");
		Integer uid =user.getUid();
	         user     =      userService.selectByPrimaryKey(uid);
	         if(password.equals(user.getPassword())){
			return "success";
		}
		return "fail";		
	}
	@RequestMapping("contact_us")
	public String contact_us(){
		
		return "contact_us";
	}
	
	/**
	 * huangrunzhiIn
	 * 修改个人信息
	 */
	@RequestMapping("updateUserInformation")
	public String updateUserInformation(HttpServletRequest request,User user,UserInformation userInformation,MultipartFile file,Photo photo)throws IOException{
		User user1 =(User) request.getSession().getAttribute("user");
		System.out.println("huangrrnzhi修改个人信息地址:"+userInformation.getAddress());
		String name=null;
		String originalFilename =null;
		if("".equals(user.getPassword())){
	           		user.setPassword(null);
		}
		//图片信息
		 if(file.getOriginalFilename()==null){		
			 System.out.println("file为空");
        }
		 else{
			 System.out.println("file不为空");
			 name = UUID.randomUUID().toString().replaceAll("-", "");	 //使用UUID给图片重命名，并去掉四个“-”	
		        originalFilename = file.getOriginalFilename(); //获取文件的扩展名
		        String workspacePath ="D:\\devsoft\\lnsf2019\\git\\artsale\\src\\main\\webapp\\uploads";//上传到本地工程目录下
		        /*String workspacePath =request.getSession().getServletContext().getRealPath("/uploads");*/	 //设置图片上传路径	这句代码返回的路径是tomcat中webapps目录下的工程路径，图片就直接保存到了tomcat中。
		        System.out.println(workspacePath);
		        file.transferTo(new File(workspacePath+"/"+name+ originalFilename));
		        	photo.setPhotourl(name+ originalFilename);	//把图片存储路径保存到数据库
		 }
		//更新用户表
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(user1.getUsername());
        example.getOredCriteria().add(criteria);
        List<User> user2 = userService.selectByExample(example);
        for (User user3 : user2) {
        	//修改用户信息1
        	user.setUid(user3.getUid());
        	userService.updateByPrimaryKeySelective(user);
        	//修改用户信息表
  	       System.out.println("图片id"+userInformation.getAddress());
 	       userInformation.setUid(user3.getUid());
 	       userInformationService.updateByPrimaryKeySelective(userInformation);
        	//更改头像
        	userInformation=userInformationService.selectByPrimaryKey(user3.getUid());
        	if(userInformation.getHeadportrait()!=null){
        		System.out.println("有图片"+name+ originalFilename);
        		photo.setPid(userInformation.getHeadportrait());
        		photo.setPhotourl(name+ originalFilename);
        		photoService.updateByPrimaryKeySelective(photo);//如果有图片就去更新
        	}else{
        	//没有图片要去插入
        		System.out.println("没有图片");
        		int result=photoService.insert(photo);
    	        if(result>0){
    	        	PhotoExample example2 = new PhotoExample();
    	        	com.lnsf.entities.PhotoExample.Criteria criteria1 = example2.createCriteria();
    	        	criteria1.andPhotourlLike(name+ originalFilename);
    	        	example2.getOredCriteria().add(criteria1);
    	        	List<Photo> phoL = photoService.selectByExample(example2);
    	        	for (Photo photo2 : phoL) {
    	        		userInformation.setHeadportrait(photo2.getPid());
    		        	System.out.println("照片"+photo2.getPid());
    	        	}
        	}
    	      
		}
        	//修改用户信息表
 	       System.out.println("图片id"+userInformation.getAddress());
	        	userInformation.setUid(user3.getUid());
	        	userInformationService.updateByPrimaryKeySelective(userInformation);
     }
        if(user1.getPower()==1){
        	return "admin/informationById";	
        		
        }else{
        	return "index";	
        }
		
	}
	
	
}
