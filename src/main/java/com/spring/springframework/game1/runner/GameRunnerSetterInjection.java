package com.spring.springframework.game1.runner;
import com.spring.springframework.game1.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

    @Component
    public class GameRunnerSetterInjection {

        private GamingConsole game;

        // ➡️ ❷ Setter injection
        @Autowired
        public void setGame(@Qualifier("SuperContra") GamingConsole game) {
            this.game = game;
        }

        public void run() {
            System.out.println("[SETTER] Running -> " + game.getClass().getSimpleName());
            game.up(); game.down(); game.left(); game.right();
        }
    }

