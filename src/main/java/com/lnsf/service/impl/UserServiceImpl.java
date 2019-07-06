package com.lnsf.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lnsf.dao.UserMapper;
import com.lnsf.entities.User;
import com.lnsf.entities.UserExample;
import com.lnsf.service.UserService;
import com.lnsf.util.PageUtil;
@Service
/**
 * 
 * @author Andrewtao
 * user的业务逻辑层
 */
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int countByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.deleteByExample(example);
	}

	@Override
	/**
	 * 根据uid删除
	 */
	public int deleteByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		int value=userMapper.deleteByPrimaryKey(uid);
		return value;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
    /**
          * 条件插入
     */
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
	 	int value=userMapper.insertSelective(record);
		return value;
	}

	@Override
	/**
	 * 查询全部人的信息
	 */
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(example);
	}

	@Override
	/**
	   * 根据uid查询
	 */
	public User selectByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(uid);
	}

	@Override
	/**
	 * 条件更新
	 */
	public int updateByExampleSelective(User record, UserExample example) {
		// TODO Auto-generated method stub
	int	value = userMapper.updateByExampleSelective(record, example);
		return value;
	}

	@Override
	public int updateByExample(User record, UserExample example) {
		// TODO Auto-generated method stub
		return userMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}
	@Override
	@Transactional
	public int register(String username,String password) {
		// TODO Auto-generated method stub
		User user =new User();
		//获取用户名密码
		UserExample userExample =new UserExample();
		String username2 =	null;
		String password2 =null;
		Integer power =null;
		Integer value=-1;
		userExample.createCriteria().andUsernameEqualTo(username);	 
		//从数据库中获取对用户名进行判断	
		List<User> list =userMapper.selectByExample(userExample);
			if(list==null||list.size()==0) {
			user.setLogintime(new Date());
			user.setUsername(username);
			user.setPassword(password);
			user.setPower(1);
			//执行插入条件
			userMapper.insertSelective(user);
			value =userMapper.selectByUid(username);

			return value;
			}  
		return -1;
	}
	@Override
    /**
     * 分页
     */
	public PageUtil<User> findByPage(int currPage) {
		// TODO Auto-generated method stub
        HashMap<String, Object> map=new HashMap<String,Object>();
        UserExample example =new UserExample();
        PageUtil<User> pageUtil = new PageUtil<User>();
		//封装当前页数
		pageUtil.setCurrPage(currPage);
		//每行显示的数据
		int pageSize=5;
		pageUtil.setPageSize(pageSize);
		//封装总记录数
		int totalCount=userMapper.countByExample(example);
		pageUtil.setTotalCount(totalCount);
		//封装总页数总记录数除以页面尺寸不为0就加一
		   int div=(totalCount/pageSize);
		   int mod=totalCount%pageSize;
		   if (mod!=0) {
			   div=div+1;
			   pageUtil.setTotal(div);
		}else {
			  pageUtil.setTotal(div);
		}
		    List<User> list =null;
		    //查询剩余最大记录数
		   int maxSize = totalCount-(currPage-1)*pageSize;
		   maxSize =   maxSize<pageSize?maxSize:pageSize;	   
		   int start =    (currPage-1)*pageSize;
		   //分页查询
		   list =  userMapper.findByPage(start,pageSize);
		    pageUtil.setList(list);
		return pageUtil;
		
	}
	@Override
	 public User selectByUsername(String username) {
	  // TODO Auto-generated method stub
	  return userMapper.selectByUsername(username);
	 }

}
