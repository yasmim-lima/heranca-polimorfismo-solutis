public class Zoologico {
    private Animal[] jaulas;
    public Zoologico() {
        jaulas = new Animal[10];
        jaulas[0] = new Cachorro("Pingo", 4);
        jaulas[1] = new Cavalo("Bob", 7);
        jaulas[2] = new Preguica("Sid", 12);
        jaulas[3] = new Preguica("Cora", 9);
        jaulas[4] = new Cavalo("Lewis", 5);
        jaulas[5] = new Cachorro("Mauro", 3);
        jaulas[6] = new Preguica("Lore", 20);
        jaulas[7] = new Cachorro("Nick", 8);
        jaulas[8] = new Cachorro("Belinha", 13);
        jaulas[9] = new Cavalo("Billy", 2);

        for (int i = 0; i < jaulas.length; i++) {
            jaulas[i].emitirSom();
            if (jaulas[i] instanceof Cachorro) {
                jaulas[i].correr();
            }
        }

    }
}