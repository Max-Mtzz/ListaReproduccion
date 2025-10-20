public class Node {
    int duracion;
    String name;
    Node next;

    public Node(String name, int duracion) {
        this.name = name;
        this.duracion = duracion;
        this.next = null;
    }
}
