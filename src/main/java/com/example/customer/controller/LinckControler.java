package com.example.customer.controller;


import com.example.customer.common.Result;
import com.example.customer.service.LinckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/customer")
public class LinckControler {

    @Autowired
    LinckService linckService;

    @PostMapping(value = "/link")
    @ResponseBody
    public Map<String, Object>linck(@RequestBody Map<String, Object> map){



/*        map.put("name","李兴");
        map.put("avatar","D:/myProduct/vue-product/vue-admin-master/static/portrait/75f6afbaceeb094a6d2520e5137f69e6_1.jpg");
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code",1);
        resultMap.put("msg","操作成功！");
        resultMap.put("user",map);*/

        return linckService.linckService(map);
    }


}
