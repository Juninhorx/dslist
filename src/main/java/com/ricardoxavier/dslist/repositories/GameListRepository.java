package com.ricardoxavier.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoxavier.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
