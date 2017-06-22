package cn.xapi.hou.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xapi.hou.mapper.BookinfoMapper;
import cn.xapi.hou.mapper.BorrowMapper;
import cn.xapi.hou.mapper.myQuery;
import cn.xapi.hou.po.Borrow;
import cn.xapi.hou.po.Readerinfo;
import cn.xapi.hou.service.BorrowService;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月12日 下午6:29:42
* @description 预约
*/

@Service
@Transactional
public class BorrowServiceImp implements BorrowService{
@Autowired

private BorrowMapper borrow;

@Autowired
private myQuery query;


	@Override
	//查询是否超过预约数量
	public int selectIsNotOutbook(Map<String, Integer> map) {
		return borrow.selectIsNotOutbook(map);
	}
	@Override
	public int yuyueBook(Map map) {
		
		return borrow.yuyueBook(map);
	}
	@Override
	//查询读者预约记录
	public List<Borrow> selectReaderBorrowAllInfo(Integer callno) {
		return query.selectReaderBorrowAllInfo(callno);
	}

}
