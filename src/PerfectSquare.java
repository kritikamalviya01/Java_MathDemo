public class PerfectSquare {
    public static void main(String[] args) {
        int num = 16;

        int square = (int) Math.sqrt(num);
        System.out.println(Math.sqrt(num));

        if(square * square == num){
            System.out.println("Perfect Square");
        }
        else {
            System.out.println("Not a perfect square");
        }
    }
}
