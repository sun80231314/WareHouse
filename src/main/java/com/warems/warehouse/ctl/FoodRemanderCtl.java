package com.warems.warehouse.ctl;

import com.warems.warehouse.entity.FoodRemainder;
import com.warems.warehouse.service.EnterWarehouse;
import com.warems.warehouse.service.FoodRemanderSer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("food-remander")
public class FoodRemanderCtl {

    @Resource
    private FoodRemanderSer foodRemanderSer;

    @ResponseBody
    @RequestMapping("get-list")
    public Map getList(){
        Map map = new HashMap<String,Object>();
        List<FoodRemainder> list = foodRemanderSer.getList();
        map.put("state",1);
        map.put("size",list.size());
        map.put("list",list);
        return map;
    }

    @ResponseBody
    @RequestMapping("out-food")
    public Map outFood(String param){
        Map map = new HashMap<String,Object>();
        if(foodRemanderSer.outFood(param)){
            map.put("state",1);
        }else {
            map.put("state",0);
        }

        return map;
    }

    @Resource
    private EnterWarehouse enterWarehouse;

    @RequestMapping("in-food")
    @ResponseBody
    public Map inFood(String name,String standard,String unit, String price,String producedate,String guaranteeperid,
                        Integer number,String posencode,String entryman,String entyrdate,String gedencode,Integer finish){
        Map map = new HashMap<String,Object>();
        if(enterWarehouse.enterToWarehouse(name,standard,unit,price,producedate,guaranteeperid, number,posencode,entryman, entyrdate, gedencode, finish))
        {
            map.put("state",1);
        }else{
            map.put("state",0);
        }
        return map;
    }
}
