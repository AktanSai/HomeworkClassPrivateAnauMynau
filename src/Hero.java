public class Hero {
    private int health;
    private int damage;
    private String skill;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSkill() {
        return skill;
    }

    Hero(int health, int damage, String skill){
            this.health = health;
            this.damage = damage;
            this.skill = skill;
        }
        Hero(int health, int damage){
            this.health = health;
            this.damage = damage;
        }
    public String toString() {
        return  "Health: " + health + " Damage: " + damage + " Skill: " + skill;
    }
}
