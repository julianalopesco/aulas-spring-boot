package com.projeto.escola.controller;
//imports...

@RestController
@RequestMapping("/turma")
public class TurmaController {
	
	@GetMapping("/{id}")
	public Turma getById(@PathVariable Integer id) {
		//aqui deverá ser implantado os códigos para localizar por id
		//return turma 
	}
	
	@PostMapping 
	public Turma post(@RequestBody Turma turma) {
		//códigos para salvar a Entidade
		//return Turma; 
	}

}
