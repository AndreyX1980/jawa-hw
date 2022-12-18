public class Main {
    public static void main(String[] args) {
        Person belosnezka = new Person("Белоснежка");
        Person prince = new Person("Принц");
        Person gnom1 = new Person("Гном1");
        Person gnom2 = new Person("Гном2");
        Person gnom3 = new Person("Гном3");
        Person gnom4 = new Person("Гном4");
        GeoTree gt = new GeoTree();
        gt.appendPerentChild(belosnezka, gnom1); // Белоснежка родитель Гнома1
        gt.appendPerentChild(belosnezka, gnom2); // Белоснежка родитель Гнома2
        gt.appendPerentChild(gnom1, gnom3);
        gt.appendPerentChild(gnom1, gnom4);
        gt.appendVifeHusbent(belosnezka, prince); // Белоснежка жена Принца
        gt.appendPerentChild(prince, gnom1); // Принц родитель Гнома1
        gt.appendPerentChild(prince, gnom2); // Принц родитель Гнома2

        System.out.println("Дети Белоснежки");
        System.out.println(new Reserch(gt).spend(belosnezka,
                Relationship.parent));

        System.out.println("Дети Принца");
        System.out.println(new Reserch(gt).spend(prince,
                Relationship.parent));

        System.out.println("Муж Белоснежки");
        System.out.println(new Reserch(gt).spend(belosnezka,
                Relationship.vife));

    }

}