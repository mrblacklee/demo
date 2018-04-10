package cn.tedu.store.service;

import cn.tedu.store.domain.T_goods;

import java.util.List;

public interface IT_goodsDaoService {
    List list();
    List selectType(String item_type);
    T_goods slectId(String id);
}
