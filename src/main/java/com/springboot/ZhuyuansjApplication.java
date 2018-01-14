package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@MapperScan("com.springboot.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class ZhuyuansjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhuyuansjApplication.class, args);
	}
}
