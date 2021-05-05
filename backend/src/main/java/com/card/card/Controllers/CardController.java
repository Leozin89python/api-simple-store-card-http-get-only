package com.card.card.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.card.card.entities.Card;
import com.card.card.service.CardService;

@RestController
@RequestMapping(value="/card")
public class CardController {
	
	@Autowired
	CardService service;
	
	
		@GetMapping
		public ResponseEntity<List<Card>> getCard(){
			List<Card> card = service.getData();
			return ResponseEntity.ok().body(card);
		}
		//corrigir
		@PostMapping(value="/insert")
		public ResponseEntity<List<Card>> insert(@RequestBody List<Card> obj){
			List<Card> card = service.insert(obj);
			return ResponseEntity.ok().body(card);
		}
		//corrigir
		@DeleteMapping(value="/delete/{id}")
		public void delete(@RequestParam Long id) {
			service.delete(id);
		}
		
}
