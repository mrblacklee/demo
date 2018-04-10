package cn.tedu.store.service;

import cn.tedu.store.domain.T_dict_areas;

import java.util.List;

public interface IT_dict_areasDaoService {
    List list();
    String insert(T_dict_areas areas);
    String update(Integer id,String areaCode,String areaName);
    String delete(Integer id);
}
