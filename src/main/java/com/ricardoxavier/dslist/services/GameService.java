package com.ricardoxavier.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardoxavier.dslist.dto.GameMinDTO;
import com.ricardoxavier.dslist.entities.Game;
import com.ricardoxavier.dslist.repositories.GameRepository;

@Service // Injetando componentes -> mostrando para o sistema que é um serviço
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; // Instanciando o repositorio para usar (injetando)
	                                       // Sempre um componente vai chamar o outro
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
