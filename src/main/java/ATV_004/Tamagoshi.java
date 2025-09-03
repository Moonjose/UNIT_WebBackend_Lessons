package ATV_004;

public class Tamagoshi {
    private String name;
    private float hungry;
    private float health;
    private int age;

    public Tamagoshi(String name, float hungry, float health, int age) {
        this.name = name;
        this.hungry = hungry;
        this.health = health;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHungry() {
        return hungry;
    }

    public void setHungry(float hungry) {
        this.hungry = hungry;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed(float amount) {
        hungry -= amount;
        if (hungry < 0) {
            hungry = 0;
        }
    }

    public String toString() {
        return "Name: " + name + " - " + "Hungry: " + hungry + " - " + "Health: " + health + " - " + "Age: " + age;
    }
}
