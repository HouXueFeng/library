package cn.xapi.hou.mapper;

import cn.xapi.hou.po.Bookinfo;
import cn.xapi.hou.po.BookinfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BookinfoMapper {
	int countByExample(BookinfoExample example);

	int deleteByExample(BookinfoExample example);

	int deleteByPrimaryKey(Integer callno);

	int insert(Bookinfo record);

	int insertSelective(Bookinfo record);

	List<Bookinfo> selectByExample(BookinfoExample example);

	Bookinfo selectByPrimaryKey(Integer callno);


	int updateByExampleSelective(@Param("record") Bookinfo record, @Param("example") BookinfoExample example);

	int updateByExample(@Param("record") Bookinfo record, @Param("example") BookinfoExample example);

	int updateByPrimaryKeySelective(Bookinfo record);

	int updateByPrimaryKey(Bookinfo record);
	
	//查询全部书籍
	List<Bookinfo> selectBookAll();
	//减少库存
	 int updateBookNumber(Map map);
	 //查询某书的数量
	 int selectBookNumber(int callno);

}