package br.com.giulianabezerra.springbootcleanarch.infrastructure.controller;

public record CreateUserRequest(String username, String password, String email) {
}
