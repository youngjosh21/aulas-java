package App;


import Programa.Celular;

public class Main {
    public static void main(String[] args) {


Celular celularA = new Celular();
        celularA.nome = "XIAOMI 12";
        celularA.espacoArmazenamento = 256;
        celularA.tamanhoTela = 6.2f;
        celularA.sistemaOperacional = "ANDROID";
        celularA.camera = "Tal";

        Celular celularB = new Celular();
        celularB.nome = "Iphone 12";
        celularB.espacoArmazenamento = 256;
        celularB.tamanhoTela = 6.1f;
        celularB.sistemaOperacional = "IOS";
        celularB.camera = "Tal";

        System.out.format("Celular %s  com tela de %.1f, com %dgb e S.O %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.camera);

// terminar depois to com fome

        System.out.print("Celular %s  com tela de %.1f, com %d , S.O %s, e camera %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.camera);
    }
}
