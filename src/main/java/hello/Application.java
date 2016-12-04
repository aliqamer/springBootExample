package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by Ali on 8/30/2016.
 */

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"hello","controller","service"})
public class Application {

    public static void main(String args[]){
        ApplicationContext context = SpringApplication.run(Application.class, args);

        /*System.out.println("Lets inspect beans provided by spring boot");

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/
    }
}
