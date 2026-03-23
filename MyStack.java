public class MyStack<T> {

    private T[] data;
    private int size;
    private int capacity;

    // Constructor
    @SuppressWarnings("unchecked")
    public MyStack() {
        this.capacity = 10; // capacidad inicial
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Inserta elemento en el tope
    public void push(T value) {
        // TODO
    }

    // Elimina el elemento del tope
    public void pop() {
        // TODO
    }

    // Retorna el elemento del tope
    public T top() {
        // TODO
        return null;
    }

    // Verifica si está vacío
    public boolean empty() {
        // TODO
        return false;
    }

    // Retorna el tamaño actual
    public int size() {
        return size;
    }

    // Retorna la capacidad actual
    public int capacity() {
        return capacity;
    }

    // Redimensiona el arreglo (por ejemplo, duplicando capacidad)
    private void resize(int newCapacity) {
        // TODO
    }

    // Limpia el stack
    public void clear() {
        // TODO
    }
}
