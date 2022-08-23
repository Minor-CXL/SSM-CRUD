package com.Dragon.Kassel.mapper;

import com.Dragon.Kassel.pro.School;
import com.Dragon.Kassel.pro.SchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table School
     *
     * @mbggenerated Fri Aug 19 21:39:22 CST 2022
     */
    int countByExample(SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table School
     *
     * @mbggenerated Fri Aug 19 21:39:22 CST 2022
     */
    int deleteByExample(SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table School
     *
     * @mbggenerated Fri Aug 19 21:39:22 CST 2022
     */
    int insert(School record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table School
     *
     * @mbggenerated Fri Aug 19 21:39:22 CST 2022
     */
    int insertSelective(School record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table School
     *
     * @mbggenerated Fri Aug 19 21:39:22 CST 2022
     */
    List<School> selectByExample(SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table School
     *
     * @mbggenerated Fri Aug 19 21:39:22 CST 2022
     */
    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table School
     *
     * @mbggenerated Fri Aug 19 21:39:22 CST 2022
     */
    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);
}