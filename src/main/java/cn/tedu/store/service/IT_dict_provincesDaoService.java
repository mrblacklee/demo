package cn.tedu.store.service;

import cn.tedu.store.domain.T_dict_provinces;

import java.util.List;

public interface IT_dict_provincesDaoService {
    List select();
    String insert(T_dict_provinces provinces);
    String update(Integer id,String provinceName,String provinceCode);
    String delete(Integer id);
}
