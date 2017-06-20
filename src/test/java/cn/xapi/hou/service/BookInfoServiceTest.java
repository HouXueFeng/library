package cn.xapi.hou.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xapi.hou.po.Bookinfo;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月10日 下午12:24:56
* @description
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-*.xml")
public class BookInfoServiceTest {
@Autowired
private BookInfoService service;
	@Test
	public final void testSelectByPrimaryKey() {
		Bookinfo selectByPrimaryKey = service.selectByPrimaryKey(1247);
		System.out.println(selectByPrimaryKey.getBookauther());
	}
	@Test
	public final void testSelectBookAll() {
		List<Bookinfo> books = service.selectBookAll();
		for (Bookinfo bookinfo : books) {
			System.out.println(bookinfo.getBookauther());
		}
	}
	
	@Test
	public final void selectBookLike(){
		Bookinfo bookinfo=new Bookinfo();
		bookinfo.setBookobject("玄幻");
		List<Bookinfo> list = service.selectBookLike(bookinfo);
		for (Bookinfo bookinfo2 : list) {
		System.out.println(bookinfo2.getBookobject());	
		}
	}
}
