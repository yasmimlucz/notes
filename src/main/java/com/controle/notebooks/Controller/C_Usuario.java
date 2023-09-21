package com.controle.notebooks.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Usuario {

    @GetMapping("/cadastro")
    public String getCadastro(){
        return "usuario/cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(@RequestParam("nome") String nome,
                                   @RequestParam("email") String email,
                                   @RequestParam("matricula") String matricula,
                                   @RequestParam("cargo") String cargo){

        return "usuario/cadastro";
    }
}
