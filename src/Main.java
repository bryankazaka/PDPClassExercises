import src.BST;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BST bst = new BST();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            bst.put(randomNumber);
        }
        System.out.println("Postorder");
        bst.postorder();
        System.out.println("Preorder");
        bst.preorder();

    }
}
