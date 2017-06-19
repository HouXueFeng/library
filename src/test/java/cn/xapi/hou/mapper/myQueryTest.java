package cn.xapi.hou.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xapi.hou.po.Borrow;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月14日 上午1:02:51
* @description 测试一对多关系映射一个用户可以有多个借书记录，一个借书记录对应一本书
* 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-dao.xml")
public class myQueryTest {
	
	@Autowired
	private myQuery query;

	@Test
	public final void testSelectReaderBorrowAllInfo() {
		
		 List<Borrow> list = query.selectReaderBorrowAllInfo(1);
		System.out.println(list.get(0).getBookinfo().getBookauther());
	}

	
	/**
	 * 模拟取消预约书号是3，用户id是1的书
	 */

	@Test
	public final void cancelBookBorroInfo(){
		
		Map<Object, Object> map=new HashMap<>();
		map.put("deleteCallNo", 3);
		map.put("deleteReaderNo", 1);
		int i = query.cancelBookBorroInfo(map);
		System.out.println(i);
	}
	
	/**
	 * 模拟取消预约（还书）库存+1
	 */
	@Test
	public final void updateBookNumberIncrement(){
		Map<Object, Object> map=new HashMap<>();
		map.put("IncrementBookNo", 3);
		int i = query.updateBookNumberIncrement(map);
		System.out.println(i);
		
	}
	
	
}
