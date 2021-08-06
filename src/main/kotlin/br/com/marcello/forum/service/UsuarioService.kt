package br.com.marcello.forum.service

import br.com.marcello.forum.model.Usuario
import br.com.marcello.forum.repository.UsuarioRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(private val repository: UsuarioRepository) {


    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }
}

