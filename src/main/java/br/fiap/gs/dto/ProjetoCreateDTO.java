package br.fiap.gs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class ProjetoCreateDTO {
    @NotBlank(message = "Título obrigatório")
    @Size(max = 200)
    private String titulo;

    @Size(max = 2000)
    private String descricao;

    private LocalDate dataInicio;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
}
