package cn.tedu.store.service;

import cn.tedu.store.domain.T_address;

import java.util.List;

public interface IT_addressDaoService {
    String insert(T_address address);
    List list();
    String detele(Integer id);
}
