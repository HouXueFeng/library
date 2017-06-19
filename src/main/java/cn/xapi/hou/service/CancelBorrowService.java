package cn.xapi.hou.service;

import java.util.Map;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月19日 上午10:55:05
* @description
*/
public interface CancelBorrowService {
	
	//取消预约
	int cancelBookBorroInfo(Map<String, Integer> map);

	
	//取消预约库存+1
	int updateBookNumberIncrement(Map<String, Integer> map);
}
