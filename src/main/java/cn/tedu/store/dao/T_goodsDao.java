package cn.tedu.store.dao;

import cn.tedu.store.domain.T_goods;

import java.util.List;

public interface T_goodsDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbg.generated
     */
    int insert(T_goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbg.generated
     */
    int insertSelective(T_goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbg.generated
     */
    T_goods selectByPrimaryKey(String id);
    List<T_goods> selectAll();
    List selectType(String item_type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(T_goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(T_goods record);
}