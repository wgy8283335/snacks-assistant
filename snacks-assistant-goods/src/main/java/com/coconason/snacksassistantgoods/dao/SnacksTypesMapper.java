package com.coconason.snacksassistantgoods.dao;

import com.coconason.snacksassistantgoods.po.SnacksTypes;
import com.coconason.snacksassistantgoods.po.SnacksTypesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SnacksTypesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int countByExample(SnacksTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int deleteByExample(SnacksTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int insert(SnacksTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int insertSelective(SnacksTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    List<SnacksTypes> selectByExample(SnacksTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    SnacksTypes selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") SnacksTypes record, @Param("example") SnacksTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int updateByExample(@Param("record") SnacksTypes record, @Param("example") SnacksTypesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int updateByPrimaryKeySelective(SnacksTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snacks_types
     *
     * @mbggenerated Wed Jun 13 16:53:07 CST 2018
     */
    int updateByPrimaryKey(SnacksTypes record);
}