public class Main {
    public static void main(String[] args) {
//instances & declarations
        ElectricPokemon picachu = new ElectricPokemon("picachu", 120, 250, "pokebrocks","electric", "pika pika","yellow", "runs");
        picachu.thunderPunch();
        WaterPokemon newto = new WaterPokemon("newto",135,350,"pokeflocks", "water","splash","blue", "swims");
        newto.surf();
        GrassPokemon weed = new GrassPokemon("weed",150,280,"pokeweed", "grass","chew chew","green","jumps");
        weed.leafStorm();
        FirePokemon flame = new FirePokemon("flame",260,380,"pokegrits", "fire","crackle","red","bursts");
        flame.fireLash();

    }
}
