
//subclass
public class ElectricPokemon extends Pokemon{
//    variabelen
    private String lightningColor;
    private String habit;

//constructor
    public ElectricPokemon(String name, int level, int hp, String food, String type, String sound, String lightningColor, String habit) {
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
    public void thunderPunch() {
        System.out.println(getName() + " strikes with a Thunderpunch!!!" );
    }
    public void electroBall() {
        System.out.println(getName() + " throws the Electroball!");
    }
    public void thunder() {
        System.out.println(getName() + " creates Thunder!!!");
    }
    public void voltTackle() {
        System.out.println(getName() + " tackles with Volttackle!!!");
    }
}
