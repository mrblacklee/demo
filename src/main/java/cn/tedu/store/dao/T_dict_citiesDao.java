package cn.tedu.store.dao;

import cn.tedu.store.domain.T_dict_cities;

import java.util.List;

public interface T_dict_citiesDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_cities
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_cities
     *
     * @mbg.generated
     */
    int insert(T_dict_cities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_cities
     *
     * @mbg.generated
     */
    int insertSelective(T_dict_cities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_cities
     *
     * @mbg.generated
     */
    T_dict_cities selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_cities
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(T_dict_cities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_cities
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(T_dict_cities record);
    List<T_dict_cities>selectAll();

}