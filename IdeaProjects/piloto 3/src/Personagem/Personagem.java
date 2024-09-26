package Personagem;

public class Personagem {
    public String nome;
    public int nivel;
    public int forca;

    // void n retorna, n tem retorno
    public void mostrarStatus(){

    System.out.format( "Personagem: %s (lvl %d) com %d de força.\n", nome , nivel, forca);

}
// esse parametro é como se eu tivesse declarando uma váriavel
    public void atacar(String alvo) {
        System.out.format("%s atacou e causou %d de dano\n", nome,forca);

    }
}
