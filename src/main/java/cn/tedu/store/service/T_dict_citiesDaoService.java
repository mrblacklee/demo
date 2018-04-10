package cn.tedu.store.service;


import cn.tedu.store.dao.T_dict_citiesDao;
import cn.tedu.store.domain.T_dict_cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T_dict_citiesDaoService implements IT_dict_citiesDaoService {
    @Autowired
    private T_dict_citiesDao t_dict_citiesDao;

    public List list(){
        List list=t_dict_citiesDao.selectAll();
        return list;
    }
    public String insert(T_dict_cities citiesDao){
        if(citiesDao==null){
            return "市不能为空";
        }else {
            t_dict_citiesDao.insert(citiesDao);
            return "选取成功";
        }

    }
    public String update(Integer id,String cityCode,String cityName){
        T_dict_cities t_dict_cities=new T_dict_cities();
        T_dict_cities t1=t_dict_citiesDao.selectByPrimaryKey(id);
        if(t1==null){
            throw new RuntimeException("地址不存在");
        }
        t1.setCityCode(cityCode);
        t1.setCityName(cityName);
        t_dict_citiesDao.updateByPrimaryKey(t_dict_cities);
        return "修改成功";
    }
    public String delete(Integer id){
        t_dict_citiesDao.deleteByPrimaryKey(id);
        return "删除成功";
    }

}
