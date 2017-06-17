package cn.xapi.hou.mapper;

import cn.xapi.hou.po.Managerinfo;
import cn.xapi.hou.po.ManagerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerinfoMapper {
    int countByExample(ManagerinfoExample example);

    int deleteByExample(ManagerinfoExample example);

    int deleteByPrimaryKey(Integer mangno);

    int insert(Managerinfo record);

    int insertSelective(Managerinfo record);

    List<Managerinfo> selectByExample(ManagerinfoExample example);

    Managerinfo selectByPrimaryKey(Integer mangno);

    int updateByExampleSelective(@Param("record") Managerinfo record, @Param("example") ManagerinfoExample example);

    int updateByExample(@Param("record") Managerinfo record, @Param("example") ManagerinfoExample example);

    int updateByPrimaryKeySelective(Managerinfo record);

    int updateByPrimaryKey(Managerinfo record);
}