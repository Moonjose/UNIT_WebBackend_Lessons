package ATV_004;

public class Main {
    public static void main(String[] args) {
        Tamagoshi tamagoshi1 = new Tamagoshi("Labubu", 100, 100, 1);
        Tamagoshi tamagoshi2 = new Tamagoshi("Bululu", 100, 100, 5);

        System.out.println(tamagoshi1);
        System.out.println(tamagoshi2);

        tamagoshi2.feed(25);
        System.out.println(tamagoshi2);

        tamagoshi1.setName("Davi Brito");
        System.out.println(tamagoshi1);

        tamagoshi1.feed(50);
        System.out.println(tamagoshi1);
    }
}
