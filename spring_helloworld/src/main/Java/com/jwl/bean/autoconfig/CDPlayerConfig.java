package com.jwl.bean.autoconfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan      // 该注解能够在spring中启用组件扫描，默认扫描与该配置类相同的包
public class CDPlayerConfig {
	// 在Java中进行显式配置Spring
}
