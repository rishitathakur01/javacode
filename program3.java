public class program3 {
    public static void main(String[] args) {

        int num = 25;
        double widened = num;

      
        double value = 25.75;
        int narrowed = (int) value;

        System.out.println("Original int value: " + num);
        System.out.println("After widening to double: " + widened);

        System.out.println("Original double value: " + value);
        System.out.println("After narrowing to int: " + narrowed);
    }
}
