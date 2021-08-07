package com.sun.mapper;

import com.sun.pojo.Account;
import java.util.List;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Thu Aug 05 22:22:22 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Thu Aug 05 22:22:22 CST 2021
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Thu Aug 05 22:22:22 CST 2021
     */
    Account selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Thu Aug 05 22:22:22 CST 2021
     */
    List<Account> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Thu Aug 05 22:22:22 CST 2021
     */
    int updateByPrimaryKey(Account record);
}