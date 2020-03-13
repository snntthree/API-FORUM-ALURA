package br.com.snntthree.api.models.form;

import br.com.snntthree.api.models.Curso;
import br.com.snntthree.api.models.Topico;
import br.com.snntthree.api.repository.CursoRepository;
import org.springframework.lang.NonNull;
import javax.validation.constraints.NotBlank;

public class TopicoForm {

    @NonNull @NotBlank
    private String titulo;
    @NonNull @NotBlank
    private String mensagem;
    @NonNull @NotBlank
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
