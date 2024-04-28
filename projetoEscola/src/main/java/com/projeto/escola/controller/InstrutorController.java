package com.projeto.escola.controller;
//imports...

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

@GetMapping("/{id}")
public Instrutor getById(@PathVariable Integer id) {
	//códigos para localizar por id
	//return Instrutor
}

@PostMapping
public Instrutor post(@RequestBody Instrutor instrutor)
	//códigos para salvar a entidade
	// return Instrutor
}
