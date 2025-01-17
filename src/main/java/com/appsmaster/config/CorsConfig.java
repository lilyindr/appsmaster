package com.appsmaster.config;


import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.servlet.MultipartConfigElement;

import org.springframework.http.HttpHeaders;
import org.springframework.util.unit.DataSize;



@Configuration
public class CorsConfig  {

   @Bean
    public WebMvcConfigurer webConfig(){
       return new WebMvcConfigurer() {
           @Override
           public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/**")
                       .allowedOrigins("http://localhost:4200")
                       .allowedMethods("GET", "POST", "PUT", "DELETE")
                       .allowedHeaders(HttpHeaders.CONTENT_TYPE,HttpHeaders.AUTHORIZATION);

           }
       };
   }
   
   @Bean
   MultipartConfigElement multipartConfigElement() {
       MultipartConfigFactory factory = new MultipartConfigFactory();
       factory.setMaxFileSize(DataSize.ofMegabytes(10)); // Sesuaikan ukuran maksimum file
       factory.setMaxRequestSize(DataSize.ofMegabytes(20)); // Sesuaikan ukuran maksimum request
       return factory.createMultipartConfig();
   }
}