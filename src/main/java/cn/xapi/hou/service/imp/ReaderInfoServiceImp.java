package cn.xapi.hou.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xapi.hou.mapper.BookinfoMapper;
import cn.xapi.hou.mapper.ReaderinfoMapper;
import cn.xapi.hou.po.Bookinfo;
import cn.xapi.hou.po.Readerinfo;
import cn.xapi.hou.service.BookInfoService;
import cn.xapi.hou.service.ReadInfotService;

/**
 * @author CreateBy HouXueFeng
 * @version 2017年6月10日 下午12:32:06
 * @description
 */

@Service
@Transactional
public class ReaderInfoServiceImp implements ReadInfotService {

	@Autowired
	private ReaderinfoMapper mapper;

	@Override
	public int insert(Readerinfo record) {
		return mapper.insert(record);
	}

	@Override
	public int registerNameOrExits(Readerinfo readerno) {
		return mapper.registerNameOrExits(readerno);
	}

	@Override
	public int selectUsernameAndPassword(Readerinfo readerno) {
		return mapper.selectUsernameAndPassword(readerno);
	}
}
