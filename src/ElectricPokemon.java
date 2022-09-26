public class ElectricPokemon extends Pokemon{
    private String lightningColor;
    private String habit;


    public ElectricPokemon(String name, int level, int hp, String food, String type, String sound, String lightningColor, String habit) {
        super(name, level, hp, food, type, sound);
        this.lightningColor = lightningColor;
        this.habit = habit;
    }
    @Override
    public void eats(){
        System.out.println(getName() + " eats " + getFood() );

    @Override
    public void speaks(){
        System.out.println(getName() + " speaks " + getFood() );

    }
}
