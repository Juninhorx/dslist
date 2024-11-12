package com.ricardoxavier.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoxavier.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> { //Tipo da entidade e do Id da entidade
	
}
