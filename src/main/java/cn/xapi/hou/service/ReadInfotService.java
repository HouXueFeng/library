package cn.xapi.hou.service;

import java.util.List;

import cn.xapi.hou.po.Bookinfo;
import cn.xapi.hou.po.Readerinfo;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月10日 下午12:23:09
* @description
*/
public interface ReadInfotService{
    int insert(Readerinfo record);

	int registerNameOrExits(Readerinfo readerno);
	
	int selectUsernameAndPassword(Readerinfo readerno);
}
