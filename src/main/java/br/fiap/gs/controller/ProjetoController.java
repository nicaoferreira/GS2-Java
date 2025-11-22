package br.fiap.gs.controller;

import br.fiap.gs.model.Projeto;
import br.fiap.gs.repository.ProjetoRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProjetoController {

    private final ProjetoRepository projetoRepository;

    public ProjetoController(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("projetos", projetoRepository.findAll());
        return "index";
    }


    @GetMapping("/form")
    public String showForm(Projeto projeto) {
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(@Valid Projeto projeto, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        projetoRepository.save(projeto);
        return "redirect:/";
    }
}