package com.sg.leo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sg.leo.domain.User;
import com.sg.leo.repository.UserDAO;

@SpringBootTest
public class UserDAOTest {

	@Autowired
	private UserDAO userDAO;
	
	@Test
	void getuserListTest() {
		User user = new User();
		user.setUsername("test1");
		user.setPassword("test123");
		user.setEmail("t@t.t");
		
		int before = userDAO.getUserList().size();
		userDAO.insertUser(user);
		int after = userDAO.getUserList().size();
		assertEquals(before+1, after);
		
	}
}
