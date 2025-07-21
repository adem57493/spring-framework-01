package com.spring.springframework.game1.leaderboard;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LeaderboardService {

    private final LeaderboardRepository repo;


    @Autowired
    public LeaderboardService(LeaderboardRepository repo) {
        this.repo = repo;
    }

    public List<String> getTopPlayers() {
        return repo.findTopPlayers();
    }
}
