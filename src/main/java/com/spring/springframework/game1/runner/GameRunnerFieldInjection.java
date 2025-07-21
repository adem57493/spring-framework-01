package com.spring.springframework.game1.runner;
import com.spring.springframework.game1.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class GameRunnerFieldInjection {


    @Autowired
    @Qualifier("SuperContra")
    private GamingConsole game;

    public void run() {
        System.out.println("[FIELD] Running -> " + game.getClass().getSimpleName());
        game.up(); game.down(); game.left(); game.right();
    }
}