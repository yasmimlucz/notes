package com.controle.notebooks.Controller;

import com.controle.notebooks.Service.S_Software;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Software {
    @GetMapping("/cadastro/software")
    public String getCadSoftware(){
        return "software/cadastro";
    }

    @PostMapping("/cadastro/software")
    @ResponseBody
    public String cadastrarSoftware(@RequestParam("nome") String nome,
                                    @RequestParam("pago") boolean exigeLicenca){
        return S_Software.cadastrarSoftware(nome, exigeLicenca);
    }
}