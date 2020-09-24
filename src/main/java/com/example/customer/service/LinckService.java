package com.example.customer.service;


import com.fasterxml.jackson.annotation.JsonAlias;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class LinckService {

    @Autowired
    RestTemplate restTemplate;

    public Map linckService(Map<String,Object> map){
        String username = String.valueOf(map.get("username"));
        String password = String.valueOf(map.get("password"));
        Map resultMap = restTemplate.getForObject("http://service-hi/user/login?userName="+username+"&passWord="+password, Map.class);
        return resultMap;
    }


}
