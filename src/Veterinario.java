public class Veterinario {
    public void examinar(Animal animal) {
        String tipoAnimal;

        if (animal instanceof Cachorro) {
            tipoAnimal = "Cachorro";
        } else if (animal instanceof Cavalo) {
            tipoAnimal = "Cavalo";
        } else if (animal instanceof Preguica) {
            tipoAnimal = "Preguiça";

            System.out.println("O " + tipoAnimal + " " + animal.getNome() + " está sendo examinado:");
            animal.emitirSom();
        }
    }
}
