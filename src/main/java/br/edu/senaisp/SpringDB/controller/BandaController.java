package br.edu.senaisp.SpringDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.SpringDB.model.Banda;
import br.edu.senaisp.SpringDB.repository.BandaRepository;

@RestController
@RequestMapping("/banda")
public class BandaController {
	
	@Autowired
	BandaRepository repository;
	
	 @GetMapping()
	 public String ListaBandas() {
		 String tmp = "";
		 for (Banda banda : repository.lista()) {
			tmp += banda.getNome();
		}
		 return tmp;
	 }
	 
	 @GetMapping("/{id}")
	 public String BuscaPorId(@PathVariable int id) {
		 return repository.buscaPorId(id).getNome();
	 }
	 
	 @PutMapping("/{id}")
	 public String Altera(@RequestBody Banda banda, @PathVariable int id) {
		 return String.valueOf(repository.altera(banda, id));
	 }
	 
	 @PostMapping()
	 public String Novo(@RequestBody Banda banda) {
		 return String.valueOf(repository.insere(banda));
	 }
	 
}
