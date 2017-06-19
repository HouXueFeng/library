package cn.xapi.hou.mapper;

import java.util.List;
import java.util.Map;

import cn.xapi.hou.po.Borrow;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月14日 上午1:00:55
 * @description
 */
public interface myQuery {
//综合查询借书信息
	List<Borrow> selectReaderBorrowAllInfo(Integer callno);

	//取消预约
	int cancelBookBorroInfo(Map map);

	
	//取消预约库存+1
	int updateBookNumberIncrement(Map map);
}
