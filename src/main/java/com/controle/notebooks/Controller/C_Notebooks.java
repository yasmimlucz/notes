package com.controle.notebooks.Controller;

import com.controle.notebooks.Service.S_Notebooks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Notebooks {

    @GetMapping("/cadastro/notebooks")
    public String getCadNotes(){
        return "notebooks/cadastro";
    }

    @PostMapping("/cadastro/notebooks")
    @ResponseBody
    public String postCadNotes(@RequestParam("numero") String numero,
                               @RequestParam("patrimonio") String patrimonio){

        return S_Notebooks.cadastrarNotebook(numero,patrimonio);
    }


}
