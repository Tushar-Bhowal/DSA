public class HelloWorld {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = str1.intern();
        System.out.println(str2);
        System.out.println(str1 == str2); // Output: false
        System.out.println(str2 == "Hello"); // Output: true

    }
}
