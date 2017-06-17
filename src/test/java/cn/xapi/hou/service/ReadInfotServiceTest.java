package cn.xapi.hou.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xapi.hou.po.Bookinfo;
import cn.xapi.hou.po.Readerinfo;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月11日 下午1:23:45
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-*.xml")
public class ReadInfotServiceTest {

	@Autowired
	private ReadInfotService service;

	@Test
	public final void test() {
		Readerinfo record = new Readerinfo();
		record.setReadername("冯帆1");
		record.setReadermajor("软件技术1");
		record.setPhone("18821752629");
		record.setReaderpassword("11");
		record.setReaderno(15303134);
		service.insert(record);
	}
	@Test
	public final void registerNameOrExits() {
	
		Readerinfo record = new Readerinfo();
		record.setReaderno(15303134);
		int i = service.registerNameOrExits(record);
		System.out.println(i+"+9999999999999999999+");
		
	}
	
	@Test
	public final void testLogin() {
	
		Readerinfo record = new Readerinfo();
		record.setReaderpassword("11");
		record.setReaderno(11);
		int i = service.registerNameOrExits(record);
		System.out.println(i+"+9999999999999999999+");
		
	}
}
