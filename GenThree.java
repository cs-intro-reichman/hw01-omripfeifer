public class Gen3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int x = (int) (Math.random() * (a - b + 1 ) + b);
        int y = (int) (Math.random() * (a - b + 1 ) + b);
        int z = (int) (Math.random() * (a - b + 1 ) + b);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        if (x <= y && x <= z) {
            System.out.println(" The minimal generated number was : " + x);
        } else if (y < x && y <= z) {
            System.out.println(" The minimal generated number was : " + y);
        } else {
            System.out.println(" The minimal generated number was " + z);
        }
    }
}
