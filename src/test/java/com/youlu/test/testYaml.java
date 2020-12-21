package com.youlu.test;

import com.youlu.util.YamlUtils;
import org.junit.Test;

import java.util.Map;

public class testYaml {
    @Test
    public void test1(){
        Map<String,String> map = YamlUtils.getMysqlConfig();
        System.out.println(map.get("username"));
        System.out.println(map.getClass().toString());
    }
}
