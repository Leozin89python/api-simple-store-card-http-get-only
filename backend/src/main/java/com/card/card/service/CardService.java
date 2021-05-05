package com.card.card.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.card.card.entities.Card;
import com.card.card.repository.CardRepository;

@Service
public class CardService {

	@Autowired
	CardRepository repository;
	
	@Transactional
	public List<Card> getData(){
		List<Card> card = repository.findAll();
		return card;
	}
	//corrigir
	@Transactional
	public List<Card> insert(List<Card> obj) {
		List<Card> card = repository.saveAll(obj);
		return card;
	}
	//corrigir
	@Transactional
	public void delete(@RequestParam Long id) {
		repository.deleteById(id);
	}
}
