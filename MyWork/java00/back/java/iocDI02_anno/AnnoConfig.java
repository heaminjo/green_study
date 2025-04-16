package com.example.test01.iocDI02_anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;




@Configuration
@ComponentScan(basePackages = "com.example.test01.iocDI02_anno")
public class AnnoConfig {

}
