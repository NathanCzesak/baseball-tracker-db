package com.practice.baseballtrackerdb;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/players")
public class BaseballPlayerController {

    private final BaseballPlayerRepository repository;

    public BaseballPlayerController(BaseballPlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<BaseballPlayer> getPlayers() {
        return repository.findAll();
    }

    @PostMapping
    public void addPlayer(@RequestBody BaseballPlayer player) {
        //Instead of players.add() use this
        //to actually save the player to the db
        repository.save(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        //Instead of players.removeIf() use this
        //which deletes the player from the db
        repository.deleteById(id);
    }

}
