import java.util.Scanner;
public class findElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and K from the first line of input
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[N];
        boolean search = false;
        int a =0;

        // Read the elements on the
        for ( int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }

        // Update your code below this line
        for(int i =0; i < N; i++){
            if(array[i] == K){
                search = true;
                a = i;
                break;
            }
        }
        if(search == true){
            System.out.println("YES "+(a+1));
        }
        else
            System.out.println("NO");
    }
}
