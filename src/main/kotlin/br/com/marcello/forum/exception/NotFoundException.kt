package br.com.marcello.forum.exception

import java.lang.RuntimeException


class NotFoundException(message: String?) : RuntimeException(message) {
}