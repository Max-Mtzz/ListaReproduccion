//Código elaborado por Max Martínez
public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add("Sussudio", 180);
        list.add("New Type of Hero", 180);
        list.add("Meant to Be", 150);
        list.print();
        list.getTotalDuration();

        System.out.println("----------------------");

        list.remove("Sussudio");
        list.print();
        list.getTotalDuration();
    }
}
