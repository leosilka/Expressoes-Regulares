package br.com.projetoucs;

import java.util.regex.Pattern;

public class Metodos {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validacaoEmail(email)) {
            this.email = email;
            System.out.println("Endereço de e-mail digitado é válido, obrigado por participar!");
        } else {
            System.out.println("Endereço de e-mail digitado é inválido, refaça seu cadastro!");
        }
    }

    public boolean validacaoEmail(String email) {
        String EMAIL_REGEX = "^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-][a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";
        Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
