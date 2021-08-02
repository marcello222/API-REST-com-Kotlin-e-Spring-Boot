package br.com.marcello.forum.mapper

interface Mapper<T, U> {

    fun map(t: T): U
}