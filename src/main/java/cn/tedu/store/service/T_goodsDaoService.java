package cn.tedu.store.service;

import cn.tedu.store.dao.T_goodsDao;
import cn.tedu.store.domain.T_goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T_goodsDaoService implements IT_goodsDaoService{
    @Autowired
    private T_goodsDao t_goodsDao;

    public List list(){
        return t_goodsDao.selectAll();
    }

    public List selectType(String item_type){
        return t_goodsDao.selectType(item_type);
    }

    public T_goods slectId(String id){
       return t_goodsDao.selectByPrimaryKey(id);
    }
}
