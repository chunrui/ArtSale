package artsale.test;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lnsf.service.UserService;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest {
   
	private static Logger  logger=Logger.getLogger(UserTest.class);
	@Autowired
	private UserService userService;

    @Test
	public void testSelectByExample() {
		System.out.println("------------------------------");
		logger.info(userService.selectByExample(null));
	}


}
