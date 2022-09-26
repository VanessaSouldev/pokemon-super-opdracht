public class Main {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();
        Pokemon picachu = new Pokemon("picachu", 120, 250, "pokebrocks","electric", "pika pika");

        pokemon.setName("newto");

        System.out.println(pokemon.getName());
        System.out.println(picachu.getName());


    }
}
