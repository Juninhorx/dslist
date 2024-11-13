package com.ricardoxavier.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ricardoxavier.dslist.dto.GameDTO;
import com.ricardoxavier.dslist.dto.GameMinDTO;
import com.ricardoxavier.dslist.entities.Game;
import com.ricardoxavier.dslist.projections.GameMinProjection;
import com.ricardoxavier.dslist.repositories.GameRepository;


@Service // Injetando componentes -> mostrando para o sistema que é um serviço
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; // Instanciando o repositorio para usar (injetando)
	                                       // Sempre um componente vai chamar o outro
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
