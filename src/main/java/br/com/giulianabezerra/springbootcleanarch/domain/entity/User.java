package br.com.giulianabezerra.springbootcleanarch.domain.entity;

public record User(String username, String password, String email) {

    public User {
        if (username == null || username.isBlank()){
            throw new IllegalArgumentException("Username cannot be null or blank");
        }
        if (!email.contains("@")){
            throw new IllegalArgumentException("Email must be valid");
        }
    }
//    public boolean verifyPassword(String inputPassword){
//        // Logica para verificar se a senha e forte o suficiente
//        // Logica para verificar se a senha correspode a senha do usuario
//        return this.password.equals(inputPassword);
//    }
}
