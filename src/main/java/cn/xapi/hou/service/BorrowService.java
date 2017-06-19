package cn.xapi.hou.service;

import java.util.List;
import java.util.Map;

import cn.xapi.hou.po.Borrow;
import cn.xapi.hou.po.Readerinfo;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月12日 下午6:28:57
* @description借书表接口
*/
public interface BorrowService {
    int selectIsNotOutbook(Map<String, Integer> map);
	int yuyueBook(Map map);
	//综合查询用户的借书信息，书籍信息，和个人信息
	 List<Borrow> selectReaderBorrowAllInfo(Integer callno);

	 
	 
}
