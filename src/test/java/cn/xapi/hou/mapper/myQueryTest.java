package cn.xapi.hou.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xapi.hou.po.Borrow;
import cn.xapi.hou.po.Readerinfo;

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

}
