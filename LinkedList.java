class LinkedList<E> {
    private ListNode<E> _head;
    private int _numberOfNodes;

    LinkedList() {
        _head = null;
        _numberOfNodes = 0;
    }

    @Override
        public boolean equals(Object obj) {
            if (obj instanceof LinkedList) {
                LinkedList temp = (LinkedList) obj;
                if (this.getSize() == temp.getSize()) {
                    ListNode<E> currThis = this._head;
                    ListNode currObj = temp._head;
                    while (currThis != null) {
                        if (!currThis.getElement().equals(currObj.getElement())) {
                            return false;
                        }
                        currThis = currThis.getNext();
                        currObj = currObj.getNext();
                    }
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }

    @Override
        public String toString() {
            String str = "[";
            ListNode<E> curr = _head;
            while (curr != null) {
                str += curr.getElement();
                str += " -> ";
                curr = curr.getNext();
            }
            str += "null]";
            return str;
        }

    int getSize() {
        return _numberOfNodes;
    }

    boolean isEmpty() {
        return _numberOfNodes == 0;
    }

    boolean sameHead(LinkedList<E> otherList) {
        return this._head == otherList._head;
    }

    //Appends a linked list of the same type
    void append(LinkedList<E> otherList) throws Exception {
        if (this.getFirst().getClass() == otherList.getFirst().getClass()) {
            ListNode<E> curr = this._head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(otherList._head);
            this._numberOfNodes += otherList._numberOfNodes;
        }
        else {
            throw new Exception("Lists of different type!");
        }
    }

    //Appends a list node
    void append(ListNode<E> node) {
        ListNode<E> curr = _head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(node);
    }

    //Adds an element to the end/tail of the list
    void add(E element) {
        if (isEmpty()) {
            _head = new ListNode<E>(element);
        }
        else {
            ListNode<E> curr = _head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new ListNode<E>(element));
        }
        _numberOfNodes++;
    }

    //Removes an element from the end of the list
    void remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("No element to remove!");
        }
        else if (getSize() == 1) { 
            _head = null;
            _numberOfNodes--;
        }
        else {
            ListNode<E> curr = _head;
            while (curr.getNext().getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(null);
            _numberOfNodes--;
        }
    }

    void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("No element to remove!");
        }
        else {
            _head = _head.getNext();
            _numberOfNodes--;
        }
    }

    boolean contains(E element) {
        boolean found = false;
        ListNode<E> curr = _head;
        while (curr != null) {
            if (curr.getElement().equals(element)) {
                found = true;
                break;
            }
            curr = curr.getNext();
        }
        return found;
    }

    E get(int index) {
        ListNode<E> curr = _head;
        while (index > 0) {
            curr = curr.getNext();
        }
        return curr.getElement();
    }

    E getFirst() {
        return _head.getElement();
    }

    void addAt(int index, E element) {
        ListNode<E> curr = _head;
        while (index > 1) {
            curr = curr.getNext();
        }
        curr.setNext(new ListNode<E>(element, curr.getNext()));
        _numberOfNodes++;
    }

    //Merges two Integer-type sorted linked lists into a single
    //sorted linked list
    LinkedList<E> merge(LinkedList<E> secondList) throws Exception {
        if (!(this.getFirst() instanceof Integer)) {
            throw new Exception("LinkedList must be Integer type");
        }
        else {
            ListNode<E> curr;
            LinkedList<E> thirdList = new LinkedList<E>();
            Integer F = (Integer) this.getFirst();
            Integer S = (Integer) secondList.getFirst();
            if (F.intValue() <= S.intValue()) {
                thirdList._head = this._head;
                this.removeFirst();
            }
            else {
                thirdList._head = secondList._head;
                secondList.removeFirst();
            }
            thirdList._numberOfNodes++;
            curr = thirdList._head;
            while (!this.isEmpty() || !secondList.isEmpty()) {
                if (this.isEmpty()) {
                    curr.setNext(secondList._head);
                    secondList.removeFirst();
                }
                else if (secondList.isEmpty()) {
                    curr.setNext(this._head);
                    this.removeFirst();
                }
                else {
                    F = (Integer) this.getFirst();
                    S = (Integer) secondList.getFirst();
                    if (F.intValue() <= S.intValue()) {
                        curr.setNext(this._head);
                        this.removeFirst();
                    }
                    else {
                        curr.setNext(secondList._head);
                        secondList.removeFirst();
                    }
                }
                thirdList._numberOfNodes++;
                curr = curr.getNext();
            }
            return thirdList;
        }
    }

    //Inspired by Soap Opera 17
    ListNode<E> findMiddleNode() {
        ListNode<E> slowNode = _head;
        ListNode<E> fastNode = _head;
        while (fastNode.getNext() != null && 
               fastNode.getNext().getNext() != null) {
            fastNode = fastNode.getNext().getNext();
            slowNode = slowNode.getNext();
        }
        return slowNode;    
    }

    void reverse() {
        if (_head.getNext() != null) {
            ListNode<E> first = _head;
            try {
                removeFirst();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            reverse();
            first.setNext(null);
            append(first);
        }
    }
}
