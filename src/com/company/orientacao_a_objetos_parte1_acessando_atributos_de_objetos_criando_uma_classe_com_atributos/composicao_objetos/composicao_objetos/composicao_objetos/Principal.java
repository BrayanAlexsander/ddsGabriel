package com.company.orientacao_a_objetos_parte1_acessando_atributos_de_objetos_criando_uma_classe_com_atributos.composicao_objetos.composicao_objetos.composicao_objetos;

public class Principal {
    public static void main(String[] args) {
        String texto;
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "João da Silva";
        meuCarro.dono.bairro = "Centro";
        imprimir();


    }
    static void imprimir(){
        System.out.println("-----------------------------");
    }
}
