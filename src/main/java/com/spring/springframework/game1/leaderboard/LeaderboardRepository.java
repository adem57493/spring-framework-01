package com.spring.springframework.game1.leaderboard;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class LeaderboardRepository {
    private final List<String> top = List.of("Mario", "Luigi", "Pac‑Man");
    public List<String> findTopPlayers() { return top; }
}