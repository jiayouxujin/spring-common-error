package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * Bean默认扫描的是Application同包下，如果将其放在不同的包中则会扫描不到，可以通过ComponentScan来显示标明
 * 源码位置
 * ComponentScanAnnotationParser#parse
 * 这里的basePackage跟ComponentScan里的value是同名(alias)
 * if (basePackages.isEmpty()) {
 * 			basePackages.add(ClassUtils.getPackageName(declaringClass));
 *  }
 */
@SpringBootApplication
@ComponentScans(value = {@ComponentScan(value = "com.example.controller")})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
