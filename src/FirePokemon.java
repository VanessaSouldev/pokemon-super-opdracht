public class FirePokemon extends Pokemon{
    private String lightningColor;
    private String habit;

    //constructor
    public FirePokemon(String name, int level, int hp, String food, String type, String sound, String lightningColor, String habit) {
        super(name, level, hp, food, type, sound);
        this.lightningColor = lightningColor;
        this.habit = habit;
    }
    //getters & setters
    public String getLightningColor() {
        return lightningColor;
    }

    public void setLightningColor(String lightningColor) {
        this.lightningColor = lightningColor;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }
    //override methods
    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }
    @Override
    public void speaks() {
        System.out.println(getName() + " speaks " + getSound() );

    }
    //    methods
    public void solarBeam() {
        System.out.println(getName() + " strikes with a Solarbeam!!!" );
    }
    public void pyroBall() {
        System.out.println(getName() + " throws the Pyroball!");
    }
    public void inferno() {
        System.out.println(getName() + " creates an Inferno!!!");
    }
    public void fireLash() {
        System.out.println(getName() + " lashes out with a Firelash!!!");
    }
}

