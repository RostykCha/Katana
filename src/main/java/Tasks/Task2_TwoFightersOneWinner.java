package Tasks;

public class Task2_TwoFightersOneWinner {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Bob", 10, 5);
        Fighter fighter2 = new Fighter("Lol", 90, 2);
        System.out.println(declareWinner(fighter1, fighter2, "Bob"));
    }


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        if (firstAttacker.equals(fighter1.name)) {
            winner = fightToDeath(fighter1, fighter2);
        } else {
            winner = fightToDeath(fighter2, fighter1);
        }
        return winner;
    }

    private static String fightToDeath(Fighter fighter1, Fighter fighter2) {
        int fighter1Health = fighter1.health;
        int fighter2Health = fighter2.health;
        String winner;
        while (true) {
            fighter2Health = fighter2Health - fighter1.damagePerAttack;
            if (fighter2Health <= 0) {
                winner = fighter1.name;
                break;
            }
            fighter1Health = fighter1Health - fighter2.damagePerAttack;
            if (fighter1Health <= 0) {
                winner = fighter2.name;
                break;
            }
        }
        return winner;
    }

    //I have chosen to use inner class
    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
