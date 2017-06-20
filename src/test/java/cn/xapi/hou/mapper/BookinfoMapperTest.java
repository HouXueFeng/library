package cn.xapi.hou.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xapi.hou.po.Bookinfo;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月10日 下午12:15:26
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-dao.xml")
public class BookinfoMapperTest {

	@Autowired
	private BookinfoMapper b;

	@Test
	public final void testSelectByPrimaryKey() {

		Bookinfo selectByPrimaryKey = b.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey.getBookname());
	}

	@Test
	public final void testSelectBookAll() {
		List<Bookinfo> selectByPrimaryKey = b.selectBookAll();
		for (Bookinfo bookinfo : selectByPrimaryKey) {
			System.out.println(bookinfo.getPic());

		}
	}
	@Test
	public final void updateBookNumber() {
		Map map=new HashMap<>();
		map.put("booknumber", 2);
		map.put("bookno", 1);
		int i = b.updateBookNumber(map);
		System.out.println(i);
	}
	
	@Test
	public final void selectBookLike(){
	

		Bookinfo bookinfo=new Bookinfo();
		bookinfo.setBookobject("电");
		List<Bookinfo> list = b.selectBookLike(bookinfo);
		for (Bookinfo bookinfo2 : list) {
		System.out.println(bookinfo2.getBookobject());	
		}
	}

}
