package xyz.hcworld.mybatis.pagedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "xyz.hcworld.mybatis.pagedemo.mapper")
public class PagedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagedemoApplication.class, args);
    }

}
