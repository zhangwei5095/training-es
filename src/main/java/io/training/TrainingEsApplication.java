package io.training;

import io.training.entity.User;
import io.training.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TrainingEsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TrainingEsApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        System.out.println("================" + (null == userService));

//        User user = new User();
//        user.setId(1L);
//        user.setName("Percy");
//        user.setDesc("Percy is boy!");
//        userService.create(user);
//
//        List<String> strs = new ArrayList<String>();
//        strs.forEach(name -> {
//                System.out.println(name);
//            }
//        );
        userService.findAll();
    }
}
