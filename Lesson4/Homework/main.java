package Lesson4.Homework;

public class main {
    public static void main(String[] args) {
        task tree = new task();
        tree.add(5);
        tree.add(1);
        tree.add(9);
        tree.add(7);
        tree.add(6);
        tree.add(2);
        tree.add(0);
        System.out.println(tree.contain(5));
        System.out.println(tree.contain(1));
        System.out.println(tree.contain(9));
        System.out.println(tree.contain(7));
        System.out.println(tree.contain(6));
        System.out.println(tree.contain(2));
        System.out.println(tree.contain(0));

    }
}
