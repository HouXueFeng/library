package cn.xapi.hou.service.imp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xapi.hou.mapper.myQuery;
import cn.xapi.hou.service.CancelBorrowService;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月19日 上午10:56:19
* @description  取消预约书籍
*/
@Service
@Transactional
public class CancelBorrowBookImp implements CancelBorrowService{

	@Autowired
	
	private myQuery query;
	
	@Override
	public int cancelBookBorroInfo(Map<String, Integer> map) {
		return query.cancelBookBorroInfo(map);
	}

	@Override
	public int updateBookNumberIncrement(Map<String, Integer> map) {
		return query.updateBookNumberIncrement(map);
	}

}
