package cn.xapi.hou.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.xapi.hou.po.Borrow;
import cn.xapi.hou.po.BorrowExample;

public interface BorrowMapper {
	int countByExample(BorrowExample example);

	int deleteByExample(BorrowExample example);

	int deleteByPrimaryKey(Integer borrowid);

	int insert(Borrow record);

	int insertSelective(Borrow record);

	List<Borrow> selectByExample(BorrowExample example);

	Borrow selectByPrimaryKey(Integer borrowid);

	int updateByExampleSelective(@Param("record") Borrow record, @Param("example") BorrowExample example);

	int updateByExample(@Param("record") Borrow record, @Param("example") BorrowExample example);

	int updateByPrimaryKeySelective(Borrow record);

	int updateByPrimaryKey(Borrow record);

	// 判断是否存在一人借书的超标问题
	int selectIsNotOutbook(Map<String, Integer> map);

	//模拟借书了
	int yuyueBook(Map map);

}
