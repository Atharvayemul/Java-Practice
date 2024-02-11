public class Main {
    public static void main(String[] args) {


        Player player = new Player();
        player.name = "Tim";
        player.health =20;
        player.weapon = "Sword";

        int damage = 10;
        player.losehealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        player.health = 200;
//        This is the example if we not encaspulate the class
        player.losehealth(11);
        System.out.println("Remaining Health " + player.healthRemaining());
    }
}