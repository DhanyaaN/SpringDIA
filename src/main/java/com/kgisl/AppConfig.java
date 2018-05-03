package com.kgisl.springdia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.kgisl")
public class AppConfig {
   @Bean
   public Employee getEmployee() {
      return new EmployeeImp();
   }
}