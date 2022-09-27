//subclass
public class WaterPokemon extends Pokemon{
//    variabelen
    private String lightningColor;
    private String habit;

//    constructor
    public WaterPokemon(String name, int level, int hp, String food, String type, String sound, String lightningColor, String habit) {
        super(name, level, hp, food, type, sound);
        this.lightningColor = lightningColor;
        this.habit = habit;
    }
//    getters en setters

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
//override methodes
    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }
    @Override
    public void speaks() {
        System.out.println(getName() + " speaks " + getSound() );

    }
//    methodes
    public void surf() {
        System.out.println(getName() + " rides the Surf!!!" );
    }
    public void hydroPump() {
        System.out.println(getName() + " pushes the Hydropump!");
    }
    public void hydroCannon() {
        System.out.println(getName() + " throws a Hydrocannon!!!");
    }
    public void rainDance() {
        System.out.println(getName() + " dances the Raindance!!!");
    }

}
