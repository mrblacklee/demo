package cn.tedu.store.dao;

import cn.tedu.store.domain.T_dict_provinces;

import java.util.List;

public interface T_dict_provincesDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_provinces
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_provinces
     *
     * @mbg.generated
     */
    int insert(T_dict_provinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_provinces
     *
     * @mbg.generated
     */
    int insertSelective(T_dict_provinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_provinces
     *
     * @mbg.generated
     */
    T_dict_provinces selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_provinces
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(T_dict_provinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_provinces
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(T_dict_provinces record);
    List<T_dict_provinces> selectAll();
}