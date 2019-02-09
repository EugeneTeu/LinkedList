class ListNode<E> {
    private E _element;
    private ListNode<E> _next;

    //CONSTRUCTORS
    ListNode(E element) {
        _element = element;
        _next = null;
    }

    ListNode(E element, ListNode<E> next) {
        _element = element;
        _next = next;
    }

    //GETTERS
    E getElement() {
        return _element;
    }

    ListNode<E> getNext() {
        return _next;
    }

    //SETTERS
    void setElement(E element) {
        _element = element;
    }

    void setNext(ListNode<E> next) {
        _next = next;
    }

    @Override 
        public String toString() {
            return "Element: " + _element;
        }
}
