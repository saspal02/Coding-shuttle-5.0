package org.saswat.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeApplication implements CommandLineRunner {

    @Autowired
    CakeBaker cakeBaker;

    public static void main(String[] args) {
        SpringApplication.run(CodeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cakeBaker.bakeCake(); // Used @Primary in Chocolate frosting
    }
}
