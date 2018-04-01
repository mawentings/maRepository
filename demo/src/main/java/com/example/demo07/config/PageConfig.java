package com.example.demo07.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;
/**
 * Created by mawen on 2017/9/21.
 */

/**
 *  Mybatis的分页插件PageHelper 的配置信息 先导入PageHelper
 */
@Configuration
public class PageConfig {
    @Bean
    public PageHelper pageHelper() {
        PageHelper  pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
