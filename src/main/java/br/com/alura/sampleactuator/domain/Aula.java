package br.com.alura.sampleactuator.domain;

import java.util.Date;

public class Aula {

    private String mensagemDeAula;
    private Date dataDeHoje;

    public Aula(String mensagemDeAula, Date dataDeHoje) {
        this.mensagemDeAula = mensagemDeAula;
        this.dataDeHoje = dataDeHoje;
    }

    public String getMensagemDeAula() {
        return mensagemDeAula;
    }

    public void setMensagemDeAula(String mensagemDeAula) {
        this.mensagemDeAula = mensagemDeAula;
    }

    public Date getDataDeHoje() {
        return dataDeHoje;
    }

    public void setDataDeHoje(Date dataDeHoje) {
        this.dataDeHoje = dataDeHoje;
    }
}
