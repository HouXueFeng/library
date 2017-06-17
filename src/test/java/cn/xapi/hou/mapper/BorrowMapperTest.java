package cn.xapi.hou.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月12日 下午6:23:51
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-dao.xml")
public class BorrowMapperTest {
	@Autowired
	private BorrowMapper borrow;

	@Test
	public final void testSelectIsNotOutbook() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("callno", 1);
		map.put("readno", 1014010111);
		int i = borrow.selectIsNotOutbook(map);
		System.out.println(i);
	}

	@Test
	public final void yuyueBook() {
		Map map = new HashMap<String, Integer>();
		map.put("yuyuebookno", 1);
		map.put("yuyueUserNo", 1);
		map.put("intime", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		map.put("outtime", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		int i = borrow.yuyueBook(map);
		System.out.println(i);
	}

}
