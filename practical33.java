public class practical33 {
    public static void main(String[] args) {
        System.out.println("Heet Patel - 240390107029");
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Usage: java practical33 <numerator> <denominator>");
            }

            double numerator = Double.parseDouble(args[0]);
            double denominator = Double.parseDouble(args[1]);

            if (denominator == 0) {
                throw new ArithmeticException("Denominator cannot be zero");
            }

            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}