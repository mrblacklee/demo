package cn.tedu.store.service;

import cn.tedu.store.dao.T_dict_citiesDao;
import cn.tedu.store.domain.T_dict_cities;

import java.util.List;

public interface IT_dict_citiesDaoService {
    List list();
    String insert(T_dict_cities citiesDao);
    String update(Integer id,String cityCode,String cityName);
    String delete(Integer id);
}
