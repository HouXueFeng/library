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
	//查询用户名是否存在
	int registerNameOrExits(Readerinfo readerno);
	//查询用户名或者密码返回是否存在
	int selectUsernameAndPassword(Readerinfo readerno);
}