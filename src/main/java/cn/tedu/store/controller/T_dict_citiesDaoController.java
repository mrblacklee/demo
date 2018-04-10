package cn.tedu.store.controller;

import cn.tedu.store.dao.T_dict_citiesDao;
import cn.tedu.store.domain.T_dict_cities;
import cn.tedu.store.service.T_dict_citiesDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/adress")
public class T_dict_citiesDaoController {
    @Autowired
    private T_dict_citiesDao t_dict_citiesDao;
    @Autowired
    private T_dict_citiesDaoService citiesdaoservice;

    @ApiOperation(value="查询所有市的地址")
    @RequestMapping(value="/citylist",method=RequestMethod.GET)
    public List citylist(){
        return citiesdaoservice.list();
    }

    @ApiOperation(value="选取市")
    @RequestMapping(value="/cityinsert",method=RequestMethod.POST)
    public String cityinsert(@RequestBody T_dict_cities citiesDao){
        return citiesdaoservice.insert(citiesDao);
    }

    @ApiOperation(value="修改市")
    @RequestMapping(value="/cityupdate",method=RequestMethod.PUT)
    public String cityupdate(@RequestBody Integer id,@RequestBody String cityCode,@RequestBody String cityName){
        return citiesdaoservice.update(id,cityCode,cityName);
    }

    @ApiOperation(value="删除市")
    @RequestMapping(value="/citydelete",method=RequestMethod.DELETE)
    public String citydelete(@RequestBody Integer id){
        return citiesdaoservice.delete(id);
    }
}
