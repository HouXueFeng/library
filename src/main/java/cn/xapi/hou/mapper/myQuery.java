package cn.xapi.hou.mapper;

import java.util.List;

import cn.xapi.hou.po.Borrow;
import cn.xapi.hou.po.Readerinfo;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月14日 上午1:00:55
* @description
*/
 public interface myQuery {
	 
	 List<Borrow> selectReaderBorrowAllInfo(Integer callno);

}
