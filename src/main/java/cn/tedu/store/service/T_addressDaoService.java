package cn.tedu.store.service;


import cn.tedu.store.dao.T_addressDao;
import cn.tedu.store.domain.T_address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class T_addressDaoService implements IT_addressDaoService {
    @Autowired(required = false)
    protected T_addressDao addressDao;

    public List list(){
        return addressDao.selectAll();
    }
    public String insert(T_address address){
        addressDao.insert(address);
        return "成功加入购物车";
    }
    public String detele(Integer id){
        addressDao.deleteByPrimaryKey(id);
        return "删除成功";
    }
}
