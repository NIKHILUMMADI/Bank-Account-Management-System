public class Main {

    public static void printList(MyList<?> list) {
        try {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.\n");
        }
    }

    public static void main(String[] args) {

        MyList<Integer> list1 = new MyArrayList<>();
        MyList<String> list2 = new MyLinkedList<>();

        try {
            list1.add(10);
            list1.add(20);
            list1.insert(15, 1);
            printList(list1);

            list2.add("A");
            list2.add("B");
            list2.delete(0);
            printList(list2);

            // Exception demo
            list1.get(10);

        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
