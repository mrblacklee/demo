package cn.tedu.store.service;


import cn.tedu.store.dao.T_dict_areasDao;
import cn.tedu.store.domain.T_dict_areas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T_dict_areasDaoService implements IT_dict_areasDaoService {
    @Autowired
    private T_dict_areasDao t_dict_areasDao;

    public List list(){
        return t_dict_areasDao.selectAll();
    }
    public  String insert(T_dict_areas areas){
        if (areas==null){
            throw new RuntimeException("区不能为空");
        }
        t_dict_areasDao.insert(areas);
        return "选取成功";
    }
    public String update(Integer id,String areaCode,String areaName){
        T_dict_areas t_dict_areas=new T_dict_areas();
        T_dict_areas t1=t_dict_areasDao.selectByPrimaryKey(id);
        if(t1==null){
            throw new RuntimeException("地址不存在");
        }
        t1.setAreaCode(areaCode);
        t1.setAreaName(areaName);
        t_dict_areasDao.updateByPrimaryKey(t_dict_areas);
        return "修改成功";
    }
    public String delete(Integer id){
        t_dict_areasDao.deleteByPrimaryKey(id);
        return "删除成功";
    }
}
