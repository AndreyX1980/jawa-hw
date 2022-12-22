import java.util.ArrayList;
import java.util.Scanner;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> searchAge() {
        System.out.print("Задайте возрастной лимит: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Персонажи, моложе: " + age + ":");

        for (Node t : tree) {

            if (t.p1.age <= age && !resultAge.contains(t.p1.fullName)) {
                resultAge.add(t.p1.fullName);
            }
        }
        return resultAge;
    }


}