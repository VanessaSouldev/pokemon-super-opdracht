public class GrassPokemon extends Pokemon{
    private String lightningColor;
    private String habit;

    //constructor
    public GrassPokemon(String name, int level, int hp, String food, String type, String sound, String lightningColor, String habit) {
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
    public void leafStorm() {
        System.out.println(getName() + " strikes with a Leafstorm!!!" );
    }
    public void leafBlade() {
        System.out.println(getName() + " throws the Leafblade!!!");
    }
    public void leechSeed() {
        System.out.println(getName() + " feeds you a Leechseed!!!");
    }
}



