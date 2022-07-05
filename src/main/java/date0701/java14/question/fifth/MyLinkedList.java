package date0701.java14.question.fifth;

public class MyLinkedList {
    private class Node {
        //内部节点
        private Object item;
        private Node prev;
        private Node next;

        public Node(Object item) {
            this.item = item;
        }

        //        int index,
        public void nodeAdd(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
                newNode.prev = this;
                MyLinkedList.this.last = this.next;
            } else {
                this.next.nodeAdd(newNode);
            }
        }

        public void nodeUpdate(int index, Object obj) {
            if (MyLinkedList.this.foot++ == index) {
                MyLinkedList.this.foot = 0;
                this.item = obj;
                return;
            } else {
                this.next.nodeUpdate(index, obj);
            }
        }

        public void nodeRemove(int index, Node previous) {
            if (++MyLinkedList.this.foot == index) {
                if (index + 1 == MyLinkedList.this.count) {
                    MyLinkedList.this.last = previous;
                }
                previous.next = this.next;
                MyLinkedList.this.foot = 0;
                return;
            } else {
                this.next.nodeRemove(index, this);
            }
        }

        public Object nodeFind(int index) {
            if (MyLinkedList.this.foot++ == index) {
                MyLinkedList.this.foot = 0;
                return this.item;
            } else {
                return this.next.nodeFind(index);
            }
        }
    }

    private Node first;
    private Node last;
    private int count = 0;
    private int foot = 0;
    private Object[] objArray;

    public void add(Object obj) {
        if (obj == null) {
            return;
        }
        Node newNode = new Node(obj);
        if (this.first == null) {
            this.first = newNode;
        } else {
            this.first.nodeAdd(newNode);
        }
        this.count++;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public Object find(int index) {
        if (this.first == null) {
            return null;
        } else if (index + 1 == count) {
            return last.item;
        } else {
            return this.first.nodeFind(index);
        }
    }

    public void remove(int index) {
        if (index == 0) {
            if (this.first != null && this.first.next != null) {
                this.first = this.first.next;
            } else {
                this.first = null;
            }
        } else {
            this.first.next.nodeRemove(index, this.first);
        }
        count--;
    }

    public void update(int index, Object obj) {
        this.first.nodeUpdate(index, obj);
    }

    public static void main(String[] args) {
        MyLinkedList link = new MyLinkedList();
        link.add("123");
        link.add("234");
        link.add("345");
        link.add("567");
        System.out.println(link.find(1));
        link.remove(3);
        System.out.println(link.find(2));
        link.update(1, 908);
        System.out.println(link.find(1));
        System.out.println(link.count);
    }
}
