package com.spring.springframework.game1.runner;

import com.spring.springframework.game1.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerConstructorInjection {

    private final GamingConsole game;


    @Autowired
    public GameRunnerConstructorInjection(@Lazy GamingConsole game) {  // bean oluşturulması ertelenir
        this.game = game;
    }

    public void run() {
        System.out.println("[CTOR] Running -> " + game.getClass().getSimpleName());
        game.up(); game.down(); game.left(); game.right();
    }
}