/*
Ester User controller, serve para poder manipular e controlar os dados
no banco de dados.
Como adiionar um novo unsuario
Fazer uma busca por um usuario yendo como base o seu ID
Listar todos os unsuarios e suas informações
 */
package com.dev.userDept.controllers;

import com.dev.userDept.entities.User;
import com.dev.userDept.repositoryes.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//Esta anotação serve para nos mostrar qual sera o endereço HTTP
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRespository respository;
    //Lista todos os Usuarios do repositorio
    @GetMapping
    public List<User> findAll(){
        List<User> result =  respository.findAll();
        return result;
    }
    //Faz a busca por um usuario, usando como base o ID do usuario
    //Esta anotação serve para nos mostrar qual sera o endereço HTTP
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result =  respository.findById(id).get();
        return result;
    }
    //Cria um novo usuario no banco de dados
    @PostMapping(value = "/user/new")
    public User insert(@RequestBody User user){
        User result =  respository.save(user);
        return result;
    }
}
