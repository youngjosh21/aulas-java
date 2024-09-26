package main;

import Personagem.Personagem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // anotações
// imprimindo as informações na tela do personagem por meio de formatação
// "Personagem: <nome> (lvl <nivel>) com <forca> de força."
        // System.out.format("Personagem: %s (lvl %d) com %d de força.\n", personagem.nome, personagem.nivel, personagem.forca);

        // variaveis e caracteristicas
        Personagem personagem = new Personagem();
        personagem.nome = "Perseus";
        personagem.nivel = 2;
        personagem.forca = 3;
        // imprimindo as informações na tela por meio de metódo
        personagem.mostrarStatus();
        // chamei um metodo atacar e usei como parametro uma String "Hydra" (alvo)
        personagem.atacar("Hydra");

    }
}