package Struktury;


public class mList {

    Element _head;
    Element _tail;
    int counter;

    public void goThroughtListForward(mList list) {
        Element p = list._head;
        while (p.next != null) {    // idz do momentu, aż nie znajdziesz następnika
            p = p.next;             // idz do ostatniego elementu
        }
    }

    public void goThroughtListBack(mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if (p.next != null) {
            Element nextEl = p.next;
            nextEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    public void addElementAtEnd(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            Element prevEl = p.prev;
            prevEl.next = p;
        } else {
            list._head = p;
        }
    }

    public Element getElementListForward(int data, mList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }

        return  p;
    }
    public Element getElementListBack(int data, mList list){
        Element p = list._tail;
        while(p.prev != null) {
            if (p.data == data) {
                break;

            }
            p = p.prev;
        }
        return p;
        }

        public void printAllElements(mList list) {              // drukujemy wszystkie elementy
            Element p = list._head;
            while (p != null) {
                System.out.println(p.data);
                p = p.next;
            }
        }
        public void addElementBeforeElement(int elementToAdd, int elementBefore, mList list) {
            Element before = list.getElementListForward(elementBefore, list);

            if(before == list._head) {                                          // wyszukaj element
                list.addElementAtBeginning(elementToAdd, list);
            }else {
                Element p = new Element();
                p.data = elementToAdd;
                p.prev = before.prev;
                p.next = before;
                Element prevBefore = before.prev;

                prevBefore.next = p;
                before.prev=p;
                list.counter++;
            }
        }
    public void addElementAfterElement(int elementToAdd, int elementAfter, mList list){
        Element after = list.getElementListBack(elementAfter, list);

        if(after == list._tail) {
            list.addElementAtEnd(elementToAdd, list);
        }else{
            Element p = new Element();
            p.data = elementToAdd;
            p.next = after.next;
            p.prev = after;
            Element nextAfter = after.next;

            nextAfter.prev = p;
            after.next =p;
            list.counter++;
        }
        }
    }


