package br.com.gerenciamento.enums;

public enum Status {

    ATIVO("Ativo"),
    INATIVO("Inativo");

    public String status;

    private Status(String status) {
        this.status = status;
    }
}
