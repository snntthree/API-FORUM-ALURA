package br.com.snntthree.api.models.form;

import br.com.snntthree.api.models.Topico;
import br.com.snntthree.api.repository.TopicoRepository;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;

public class AtualizaTopicoForm {
    @NonNull
    @NotBlank
    private String titulo;
    @NonNull @NotBlank
    private String mensagem;

    @NonNull
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NonNull String titulo) {
        this.titulo = titulo;
    }

    @NonNull
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(@NonNull String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getOne(id);

        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
