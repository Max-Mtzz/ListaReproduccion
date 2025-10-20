public class SinglyLinkedList {
    private Node head;

    //Creamos nuestro método para añadir
    public void add(String name, int duracion){
        //Creamos un nodo
        Node newNode = new Node(name, duracion);
        //Verificamos si la cabeza esta vacia
        if(head == null){
            //Si la lista esta vacía el nuevo nodo se convierte en la cabeza
            head = newNode;
            return;
        }
        //En caso de no estar vacía va a reccorrer todos los nodos hasta encontrar la referencia(next) en null
        //Comenzamos desde el primero
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        //Se agrega el nuevo nodo en la referencia del ultimo nodo
        current.next = new Node(name, duracion);
    }

    //Eliminar un elemento
    public void remove(String name){
        if(head == null) return;

        //Verifica si el dato a eliminar no es la cabecera;
        if(head.name == name){
            head = head.next;
        }

        Node current = head;
        //Recorre si es diferente de null y si es diferente del dato que queremos eliminar hasta hallarlo
        while (current.next!=null && current.next.name.equals(name)) {
            current = current.next;
        }
        //Lo eliminamos con el siguiente del siguiente
        current.next = current.next.next;
    }

    public int getTotalDuration() {
        //Incializamos el total de duracion
        int total = 0;
        Node current = head;
        //Mientras el nodo actual no este vacio se va a ir sumando la duracion de las canciones
        while (current != null) {
            total += current.duracion;
            current = current.next;
        }
        System.out.println("Duración Total: "+total);
        return total;
    }

    //Imprimir datos
    public void print(){
        //El current equivale a la cabeza
        Node current = head;
        //Mientras el current sea diferente de null imprime el dato
        while(current!=null){
            System.out.println(current.name+" "+current.duracion+"s");
            current = current.next;
        }
        System.out.println("null");
    }
}
