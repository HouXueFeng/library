package cn.xapi.hou.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xapi.hou.mapper.BookinfoMapper;
import cn.xapi.hou.po.Bookinfo;
import cn.xapi.hou.service.BookInfoService;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月10日 下午12:32:06
 * @description 书籍信息
 */

@Service
@Transactional
public class BookInfoServiceImp implements BookInfoService {
	@Autowired

	private BookinfoMapper mapper;

	//查询单个书籍
	@Override
	public Bookinfo selectByPrimaryKey(Integer callno) {
		return mapper.selectByPrimaryKey(callno);
	}

	//查询全部书籍
	@Override
	public List<Bookinfo> selectBookAll() {
		return mapper.selectBookAll();
	}

	//修改书籍
	@Override
	public int updateBookNumber(Map map) {
		return mapper.updateBookNumber(map);

	}
	//按照书号查询书籍
	@Override
	public int selectBookNumber(int callno) {
		return mapper.selectBookNumber(callno);
	}

	//模糊查询书籍
	@Override
	public List<Bookinfo> selectBookLike(Bookinfo object) {
		return mapper.selectBookLike(object);
	}

}
