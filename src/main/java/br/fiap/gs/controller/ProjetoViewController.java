package br.fiap.gs.controller;

import br.fiap.gs.service.ProjetoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetoViewController {

    private final ProjetoService service;

    public ProjetoViewController(ProjetoService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("projetos", service.listarTodos());
        return "index";
    }

    @GetMapping("/projetos")
    public String listarProjetos(Model model) {
        model.addAttribute("projetos", service.listarTodos());
        return "index";
    }

    @GetMapping("/projetos/novo")
    public String novoProjeto() {
        return "form";
    }
}
