package cn.xapi.hou.service;

import java.util.List;
import java.util.Map;

import cn.xapi.hou.po.Bookinfo;

/**
* @author  CreateBy HouXueFeng
* @version 2017年6月10日 下午12:23:09
* @description
*/
public interface BookInfoService{
 
    Bookinfo selectByPrimaryKey(Integer callno);
	List<Bookinfo> selectBookAll();
	 int updateBookNumber(Map map);
	 int selectBookNumber(int callno);
	 
	 
	 

}
