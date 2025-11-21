package br.fiap.gs.service;

import br.fiap.gs.dto.ProjetoCreateDTO;
import br.fiap.gs.model.Projeto;
import br.fiap.gs.repository.ProjetoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjetoService {
    private final ProjetoRepository repo;
    public ProjetoService(ProjetoRepository repo) { this.repo = repo; }

    public List<Projeto> listarTodos(){ return repo.findAll(); }

    public Projeto buscarPorId(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

    public Projeto criar(ProjetoCreateDTO dto){
        Projeto p = new Projeto();
        p.setTitulo(dto.getTitulo());
        p.setDescricao(dto.getDescricao());
        p.setDataInicio(dto.getDataInicio());
        p.setStatus("NOVO");
        return repo.save(p);
    }

    public Projeto atualizar(Long id, ProjetoCreateDTO dto){
        Projeto p = buscarPorId(id);
        p.setTitulo(dto.getTitulo());
        p.setDescricao(dto.getDescricao());
        return repo.save(p);
    }

    public void deletar(Long id){
        repo.deleteById(id);
    }
}
