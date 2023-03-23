package com.itgb.springbootinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name}")
    private String name1;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @Value("${person.address[0]}")
    private String a1;

    @Value("${person.address[1]}")
    private String a2;

    @Value("${person.address[2]}")
    private String a3;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @RequestMapping("/t")
    public String T(){
        return name+":"+age+":"+name1+":"+a1+":"+a2+":"+a3;
    }

    @RequestMapping("/hello2")
    public String hello2() {

        System.out.println(name);
        System.out.println(name1);
        System.out.println(age);
        System.out.println(a1);

        System.out.println("----------------------");
        System.out.println(env.getProperty("person.name"));
        System.out.println(env.getProperty("person.address[0]"));
        System.out.println(person);
        String[] address = person.getAddress();
        for (String s : address) {
            System.out.println(s);
        }
        return "hello Spring Boot 222!";
    }
    @RequestMapping("/t1")
    public String T1(){
        return "t1------";
    }
}
