package S8_Lab;
public class Main {
    public static void main(String[] args) {
        float floatNum = 1.23456789f;
        double doubleNum = 1.23456789;

        System.out.println("floatNum: " + floatNum);
        System.out.println("doubleNum: " + doubleNum);

        // Precisión
        floatNum = 123456789.123456789f;
        doubleNum = 123456789.123456789;

        System.out.println("floatNum: " + floatNum);
        System.out.println("doubleNum: " + doubleNum);

        // Rango
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Max float: " + maxFloat);
        System.out.println("Max double: " + maxDouble);

        float infinityFloat = Float.POSITIVE_INFINITY;
        double infinityDouble = Double.POSITIVE_INFINITY;

        System.out.println("Infinity float: " + infinityFloat);
        System.out.println("Infinity double: " + infinityDouble);

        // NaN (Not a Number)
        float nanFloat = Float.NaN;
        double nanDouble = Double.NaN;

        System.out.println("NaN float: " + nanFloat);
        System.out.println("NaN double: " + nanDouble);
        
    }
}
