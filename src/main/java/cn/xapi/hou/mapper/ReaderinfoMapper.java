package cn.xapi.hou.mapper;

import cn.xapi.hou.po.Readerinfo;
import cn.xapi.hou.po.ReaderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReaderinfoMapper {
	int countByExample(ReaderinfoExample example);

	int deleteByExample(ReaderinfoExample example);

	int deleteByPrimaryKey(Integer readerno);

	int insert(Readerinfo record);

	int insertSelective(Readerinfo record);

	List<Readerinfo> selectByExample(ReaderinfoExample example);

	Readerinfo selectByPrimaryKey(Integer readerno);

	int updateByExampleSelective(@Param("record") Readerinfo record, @Param("example") ReaderinfoExample example);

	int updateByExample(@Param("record") Readerinfo record, @Param("example") ReaderinfoExample example);

	int updateByPrimaryKeySelective(Readerinfo record);

	int updateByPrimaryKey(Readerinfo record);

	int registerNameOrExits(Readerinfo readerno);
	
	int selectUsernameAndPassword(Readerinfo readerno);
}