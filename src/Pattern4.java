public class Pattern4 {
    public static void main(String[] args) {
        int num = 5;
        for(int i =1;i<=num;i++){
            for(int j=i;j<=num-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}