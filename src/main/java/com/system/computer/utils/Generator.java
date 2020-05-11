package com.system.computer.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2019/11/29 0029 11:01
 * @Created by /SurpriseWang
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean override = false;
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(in);
        DefaultShellCallback callback = new DefaultShellCallback(override);
        MyBatisGenerator mbg = new MyBatisGenerator(config, callback, warnings);
        mbg.generate(null);
        for (String warn : warnings) {
            System.out.println(warn);
        }
    }
}
