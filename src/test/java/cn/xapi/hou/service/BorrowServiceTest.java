package cn.xapi.hou.service;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月12日 下午6:32:02
* @description
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-*.xml")
public class BorrowServiceTest {

	@Autowired
	private BorrowService borrow;
	@Test
	public final void testSelectIsNotOutbook() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("callno", 1);
		map.put("readno", 1014010111);
		int i = borrow.selectIsNotOutbook(map);
		System.out.println(i);
	}

}
