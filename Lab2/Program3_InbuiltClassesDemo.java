public class Program3_InbuiltClassesDemo {
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.print("System.arraycopy: ");
        for (int val : dest) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("System.currentTimeMillis(): " + System.currentTimeMillis());
        System.gc();

        System.out.println("Math.sqrt(25.0): " + Math.sqrt(25.0));
        System.out.println("Math.abs(-42): " + Math.abs(-42));
        System.out.println("Math.min(10, 20): " + Math.min(10, 20));
        System.out.println("Math.max(10, 20): " + Math.max(10, 20));
        System.out.println("Math.round(4.6): " + Math.round(4.6));
        int rand0to10 = (int) (Math.random() * 11);
        int rand0to100 = (int) (Math.random() * 101);
        System.out.println("Random between 0 to 10: " + rand0to10);
        System.out.println("Random between 0 to 100: " + rand0to100);

        String s = "Hello World";
        System.out.println("String.length(): " + s.length());
        System.out.println("String.charAt(1): " + s.charAt(1));
        System.out.println("String.substring(0, 5): " + s.substring(0, 5));
        System.out.println("String.equals(\"Hello World\"): " + s.equals("Hello World"));
        System.out.println("String.equalsIgnoreCase(\"hello world\"): " + s.equalsIgnoreCase("hello world"));
        System.out.println("String.compareTo(\"Hello\"): " + s.compareTo("Hello"));
        System.out.println("String.contains(\"World\"): " + s.contains("World"));
        System.out.println("String.indexOf('o'): " + s.indexOf('o'));

        int parsed = Integer.parseInt("123");
        Integer obj = Integer.valueOf("456");
        Integer decoded = Integer.decode("0x1A");
        System.out.println("Integer.parseInt(\"123\"): " + parsed);
        System.out.println("Integer.valueOf(\"456\"): " + obj);
        System.out.println("Integer.decode(\"0x1A\"): " + decoded);
        System.out.println("Integer.intValue(): " + obj.intValue());
        System.out.println("Integer.byteValue(): " + obj.byteValue());
        System.out.println("Integer.toString(789): " + Integer.toString(789));
    }
}
