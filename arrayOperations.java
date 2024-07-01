public class arrayOperations {
    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "Daya", "Elexir", "Fan"};

        // Update the code below this line
        for (int i = 0; i < names.length; i++) {
            if (i % 2 != 1) {
                System.out.print(names[i] + " Even ");
            }
        }

    }
}
