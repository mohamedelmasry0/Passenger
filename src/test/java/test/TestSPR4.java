package test;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;

//Domaine3.4
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSPR4 {

	@Inject
	@Named("mainDS")
	DataSource ds;
	@Test
	public void Test() throws SQLException {
		Assert.assertEquals("PUBLIC", ds.getConnection().getSchema());
	}
}
