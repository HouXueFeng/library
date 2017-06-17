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
* @description
*/

@Service
@Transactional
public class BorrowServiceImp implements BorrowService{
@Autowired

private BorrowMapper borrow;

@Autowired
private myQuery query;
	@Override
	public int selectIsNotOutbook(Map<String, Integer> map) {
		return borrow.selectIsNotOutbook(map);
	}
	@Override
	public int yuyueBook(Map map) {
		
		return borrow.yuyueBook(map);
	}
	@Override
	public List<Borrow> selectReaderBorrowAllInfo(Integer callno) {
		return query.selectReaderBorrowAllInfo(callno);
	}

}
