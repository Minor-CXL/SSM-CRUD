package com.Dragon.Kassel.mapper;

import com.Dragon.Kassel.pro.Student;
import com.Dragon.Kassel.pro.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int deleteByPrimaryKey(String sName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    Student selectByPrimaryKey(String sName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Tue Aug 23 23:06:05 CST 2022
     */
    int updateByPrimaryKey(Student record);
}