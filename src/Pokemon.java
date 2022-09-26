public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String type;
    private String sound;

    public Pokemon() {
    }

    public Pokemon(String name, int level, int hp, String food, String type, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.type = type;
        this.sound = sound;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void eats();

    public abstract void speaks();
}
//    Pokèmon kunnen ook ontzettend veel verschillende acties uitvoeren. Zo kun je denken aan de volgende methodes:
//
//        eats()
//        speaks()
//        thunderPunch()
//        surf()
//        leafStorm()
//        inferno()
//        electroBall()
//        pyroBall*()
//        solarBeam()
//        hydroPump()
//        thunder()
//        hydroCanon()
//        fireLash()
//        leechSeed()
//        voltTackle()
//        rainDance()
//        leaveBlade()
//        flameThrower()