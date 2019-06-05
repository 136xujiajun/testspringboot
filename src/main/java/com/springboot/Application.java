package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 该注解被 @Configuration、@EnableAutoConfiguration、@ComponentScan 注解所修饰
 * 换言之 Springboot 提供了统一的注解来替代以上三个注解，
 *
 * 通过@MapperScan(“com.xu.springboot.mapper”)指定Dao层的包路径，
 * 通过mapper-locations配置了MyBatis文件的扫描路径，达到对应映射的效果
 *
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	/**
	 * 解决浏览器跨域问题的配置
	 * @return
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				//这个网址 www.tony.com 这个网址下的/user下的所有请求
				registry.addMapping("/user/**")
						//拦截那个网址 http://www.tony.com 自己的网址
						.allowedOrigins("http://www.tony.com");
//						.allowedMethods("PUT", "DELETE")
//						.allowedHeaders("header1", "header2", "header3")
//						.exposedHeaders("header1", "header2")
//						.allowCredentials(true).maxAge(3600);
			}
		};
	}
}
