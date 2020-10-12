package com.dp.hodgepodge.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义 WebMvcConfig 实现路径映射
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //自定义通过/yolo 映射到 hello.html
        registry.addViewController("/yolo").setViewName("hello");
    }
}
