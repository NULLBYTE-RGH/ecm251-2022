package vitor.joao;

import java.util.Random;

public class Transacao {
    private boolean executarTransacao;
    private Usuario usuario;
    private Conta conta;
    private double valor;
    private int id;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void gerarCode(Usuario usuario,Conta conta,double valor, int id){
        int Rand = getRandomNumberInRange(1000, 9999);
        String S = ((conta.idConta)+ ';' +(usuario.nome).toString() + ';' + valor+ ';' + Rand);
        String[] dados = S.split(";");
    }

}
