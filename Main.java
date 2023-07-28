package Lesson3;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(7);
        bt.add(3);
        bt.add(1);
        bt.add(6);
        bt.add(0);
        bt.add(2);
        bt.add(4);
        bt.add(5);
        bt.add(12);
        bt.add(13);
        bt.add(15);
        bt.add(14);
        bt.add(9);
        bt.add(8);
        bt.add(11);
        bt.add(10);
        System.out.println(bt.containsNode(11));
        System.out.println(bt.containsNode(5));
        System.out.println(bt.containsNode(0));
        bt.delete(1);
        System.out.println(bt.containsNode(1));
        System.out.println(bt.containsNode(2));
        System.out.println(bt.containsNode(0));

    }
}
