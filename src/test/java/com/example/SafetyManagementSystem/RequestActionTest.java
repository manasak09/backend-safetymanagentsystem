package com.example.SafetyManagementSystem;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.RequestActionService;
import com.model.RequestAction;


import org.junit.Assert;
@SpringBootTest
class RequestActionTest {
	@Autowired
	RequestActionService service;

	@Test
	void testAddRequest() {
		RequestAction action=new RequestAction ();
		action.setUsername("Manasa");
		action.setPassword("12345");
		action.setMobile("9898989898");
	    service.addRequest(action);
	RequestAction st=service.findAction(action.getRequestActionid1());
	Assert.assertEquals("Manasa", st.getUsername());
	Assert.assertEquals("12345",st.getPassword());
	Assert.assertEquals("9898989898",st.getMobile());
	
	
	}

	@Test
	void testFindAction() {
		RequestAction action=new RequestAction();
		action.setMobile("9898989898");
		action.setPassword("08002");
		action.setUsername("raghu");
	
		try {
			service.addRequest(action);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		RequestAction action2=service.findAction(action.getRequestActionid1());
		Assert.assertNotNull(action2);
		
	}

	@Test
	void testFindAllAction() {
		RequestAction action=new RequestAction();
		action.setUsername("Raghavendra");
		action.setPassword("23456");
		action.setMobile("8989898989");
		service.addRequest(action);
		
		RequestAction action1=new RequestAction();
		action1.setUsername("Shubham");
		action1.setPassword("34567");
		action1.setMobile("7878787878");
		service.addRequest(action1);
		
		RequestAction action2=new RequestAction();
		action2.setUsername("Priya");
		action2.setPassword("45678");
		action2.setMobile("6767676767");
		service.addRequest(action2);
		
		List<RequestAction> actionlist=service.findAllAction();
		actionlist.get(0).getPassword();
	//Assert.assertEquals(actionlist.get(0).getPassword(), "08002");
		Assert.assertEquals(actionlist.get(1).getPassword(), "080008");
		Assert.assertEquals(actionlist.get(2).getPassword(), "23456");
		Assert.assertEquals(actionlist.get(3).getPassword(), "34567");
	}
	
	@Test
	void testUpdateAction() {
		RequestAction action1=new RequestAction();
		action1.setUsername("Sailesh");
		action1.setPassword("080008");
		action1.setMobile("9389765990");
		service.addRequest(action1);
		action1.setMobile("7878787878");
		service.updateAction(action1);
		Assert.assertEquals(true, service.updateAction(action1));
	}

	@Test
	void testDeleteAction() {
		service.deleteAction(13);
	RequestAction action=	service.findAction(13);
	Assert.assertNull(action);
	}
	

}
