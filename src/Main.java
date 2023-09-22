public class Main {
    public static void main(String[] args) {
       Boss skeletonKing = new Boss();
        skeletonKing.setHealth(1000);
        skeletonKing.setDamage(250);
        skeletonKing.setDefense("Magic, fire, stan resistance");

        System.out.println("Boss health: " + skeletonKing.getHealth());
        System.out.println("Boss damage: " + skeletonKing.getDamage());
        System.out.println("Boss defense: " + skeletonKing.getDefense());

        Hero[] heroes = createHeroes();
        for (Hero hero: heroes) {
            System.out.println(hero.toString());
            
        }
    }

    public static Hero[] createHeroes(){
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(250, 55, "Fire blast");
        heroes[1] = new Hero(300, 80, "Stan attacks");
        heroes[2] = new Hero(200, 120, "Time dimensions");

        return heroes;
    }
    
}