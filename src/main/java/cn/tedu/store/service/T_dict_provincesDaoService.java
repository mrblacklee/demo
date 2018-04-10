package cn.tedu.store.service;

import cn.tedu.store.dao.T_dict_provincesDao;
import cn.tedu.store.domain.T_dict_provinces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class T_dict_provincesDaoService implements IT_dict_provincesDaoService{
    @Autowired
    private T_dict_provincesDao t_dict_provincesDao;
    public List select(){
        List list=t_dict_provincesDao.selectAll();
        return list;

    }
    public String insert(T_dict_provinces provinces){
        if (provinces==null){
            return "请选择省份";
        }else{
            t_dict_provincesDao.insert(provinces);
            return "省份选取成功";
        }
    }
    public String update(Integer id,String provinceName,String provinceCode){
        T_dict_provinces t_dict_provinces=new T_dict_provinces();
        T_dict_provinces t1=t_dict_provincesDao.selectByPrimaryKey(id);
        if(t1==null){
            throw new RuntimeException("地址不存在");
        }
        t1.setProvinceName(provinceName);
        t1.setProvinceCode(provinceCode);
        t_dict_provincesDao.updateByPrimaryKey(t_dict_provinces);
        return "修改地址完成";
    }
    public String delete(Integer id){
        t_dict_provincesDao.deleteByPrimaryKey(id);
        return "删除成功";
    }
}
