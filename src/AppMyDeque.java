
public class AppMyDeque {

    public static void main(String[] args) {

        MyArrayDeque myArrayDeque = new MyArrayDeque(6);

        System.out.println(myArrayDeque);
        myArrayDeque.addToHead(2);
        System.out.println(myArrayDeque);
        myArrayDeque.addToTail(5);
        System.out.println(myArrayDeque);
        myArrayDeque.addToHead(4);
        System.out.println(myArrayDeque);
        myArrayDeque.addToTail(6);
        System.out.println(myArrayDeque);
        System.out.println(myArrayDeque.peekHead());
        System.out.println(myArrayDeque.peakTail());

        System.out.println(myArrayDeque.contains(2));
        myArrayDeque.addToTail(3);
        myArrayDeque.addToTail(7);
        System.out.println(myArrayDeque);
        myArrayDeque.addToHead(20);
        System.out.println(myArrayDeque);
    }
}



