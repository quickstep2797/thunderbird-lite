public class ThunderBirdLite {
    public static void main(String[] args) {
        System.out.println("ThunderBird");
        
        if (args.length != 1) {
            System.out.println("Error: This application requires one argument that is the name of a file.");
            System.exit(0);
        }
        System.out.println(args[0]);
    }
}
