package br.com.marcello.forum.service

import br.com.marcello.forum.model.Curso
import br.com.marcello.forum.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*


@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
       return repository.getOne(id)
    }
}
