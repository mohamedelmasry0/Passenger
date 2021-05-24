package test;



import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSPR2 {
	@Inject
	@Named("My first bean") 
	String bean;
	
	@Test
	public void Test() {
		//given an appecationContextloaded by context config
		
		//When
		//Then bean shouldn't been null
		Assert.assertNotNull(bean);
	}
}
