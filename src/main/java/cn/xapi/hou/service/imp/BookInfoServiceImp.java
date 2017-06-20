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
 * @description
 */

@Service
@Transactional
public class BookInfoServiceImp implements BookInfoService {
	@Autowired

	private BookinfoMapper mapper;

	@Override
	public Bookinfo selectByPrimaryKey(Integer callno) {
		return mapper.selectByPrimaryKey(callno);
	}

	@Override
	public List<Bookinfo> selectBookAll() {
		return mapper.selectBookAll();
	}

	@Override
	public int updateBookNumber(Map map) {
		return mapper.updateBookNumber(map);

	}

	@Override
	public int selectBookNumber(int callno) {
		return mapper.selectBookNumber(callno);
	}

	@Override
	public List<Bookinfo> selectBookLike(Bookinfo object) {
		return mapper.selectBookLike(object);
	}

}
