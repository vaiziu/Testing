public class Main {
    public static void main(String[] args) {
        System.out.println(assertEquals( formatName("vaida"), "Vaida"));
        System.out.println(assertEquals( formatName("VAIDA"), "Vaida"));
        System.out.println(assertEquals( formatName("vAIDA"), "Vaida"));//overlap
        System.out.println(assertEquals( formatName("  Vaida"), "Vaida"));
        System.out.println(assertEquals( formatName("Vaida  "), "Vaida"));
        System.out.println(assertEquals( formatName("Vaida"), "Vaida"));
    }
    public static String formatName(String name) {
        //loose the spaces here
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        return name;
    }

    public static boolean assertEquals(String actual, String expected) {
       return actual.equals(expected);
    }




}



