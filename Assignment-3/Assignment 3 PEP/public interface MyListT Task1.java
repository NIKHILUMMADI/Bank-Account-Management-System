public interface MyList<T> {

    // Adds an element at the end of the list
    void add(T element);

    // Inserts an element at a specific index
    void insert(T element, int index);

    // Returns the element at the given index
    T get(int index);

    // Deletes the element at the specified index
    void delete(int index);

    // Returns the number of elements in the list
    int size();

    // Checks whether the list is empty
    boolean isEmpty();
}
