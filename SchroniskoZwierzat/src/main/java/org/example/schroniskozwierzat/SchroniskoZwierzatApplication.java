package org.example.schroniskozwierzat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SchroniskoZwierzatApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchroniskoZwierzatApplication.class, args);
    }
}
