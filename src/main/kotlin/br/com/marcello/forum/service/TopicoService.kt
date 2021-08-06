package br.com.marcello.forum.service

import br.com.marcello.forum.dto.AtualizacaoTopicoForm
import br.com.marcello.forum.dto.NovoTopicoForm
import br.com.marcello.forum.dto.TopicoView
import br.com.marcello.forum.exception.NotFoundException
import br.com.marcello.forum.mapper.TopicoFormMapper
import br.com.marcello.forum.mapper.TopicoViewMapper
import br.com.marcello.forum.model.Topico
import br.com.marcello.forum.repository.CursoRepository
import br.com.marcello.forum.repository.TopicoRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors


@Service
class TopicoService(
    private val repository: TopicoRepository,
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper,
    private val notFoundMessage: String = "Topico nao encontrado!"
) {

    fun listar(): List<TopicoView> {
        return repository.findAll().stream().map { t ->
            topicoViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = repository.findById(id).orElseThrow{NotFoundException(notFoundMessage)}
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(form: NovoTopicoForm): TopicoView {
        val topico = topicoFormMapper.map(form)
        repository.save(topico)
        return topicoViewMapper.map(topico)
    }

    fun atualizar(form: AtualizacaoTopicoForm): TopicoView {
        val topico = repository.findById(form.id).orElseThrow{NotFoundException(notFoundMessage)}
        topico.titulo = form.titulo
        topico.mensagem = form.mensagem
        return topicoViewMapper.map(topico)
    }

    fun deletar(id: Long) {
        repository.deleteById(id)
    }

}