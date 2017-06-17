package cn.xapi.hou.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xapi.hou.po.Readerinfo;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月11日 下午1:13:27
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-dao.xml")
public class ReaderinfoMapperTest {

	@Autowired
	private ReaderinfoMapper reader;
	/**
	 * 注册
	 */
	@Test
	public final void testInsert() {
		Readerinfo record = new Readerinfo();
		record.setReadername("冯帆");
		record.setReadermajor("软件技术");
		record.setPhone("18821752629");
		record.setReaderpassword("11");
		record.setReaderno(15303138);
		reader.insert(record);

	}

	/**
	 * 查询用户用户是否存在
	 */
	@Test
	public final void registerNameOrExits() {
		Readerinfo record = new Readerinfo();
		
		record.setReaderno(15303138);
		
		int count = reader.registerNameOrExits(record);
		System.out.println(count);

	}
	
	/**
	 * 查询用户是否具备登录条件
	 */
	@Test
	public final void selectUsernameAndPassword() {
		Readerinfo record = new Readerinfo();
		
		record.setReaderno(11);
		record.setReaderpassword("111");
		int count = reader.selectUsernameAndPassword(record);
		System.out.println(count);

	}
	

}
