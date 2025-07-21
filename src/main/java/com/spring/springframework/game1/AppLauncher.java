package com.spring.springframework.game1;

import com.spring.springframework.game1.game.GameRunner;
import com.spring.springframework.game1.game.GamingConsole;
import com.spring.springframework.game1.runner.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.springframework.game1")
public class AppLauncher {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppLauncher.class)) {



            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
            context.getBean(GameRunnerFieldInjection.class).run();
            context.getBean(GameRunnerSetterInjection.class).run();
            context.getBean(GameRunnerConstructorInjection.class).run();


        }
    }
}