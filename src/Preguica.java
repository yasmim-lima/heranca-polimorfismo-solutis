public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subirEmArvores(){
        System.out.println(" " + this.getNome() + "está subindo na árvore");
    }
    @Override
    public void emitirSom() {
        System.out.println(" " + this.getNome() + ": Zzz...");
    }
}
