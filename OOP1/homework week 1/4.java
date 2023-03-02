public class Main {
    public static void main(String[] args) {
        //{'s', 'i', 't', ' ', 't', 'u', '-', 'v', 'A', 'R', 'N', 'A'},
        
        char[] array = {'s', 'i', 't', ' ', 't', 'u', '-', 'v', 'A', 'R', 'N', 'A'};

        for (int i = 0; i < array.length; i++) {

            char currChar = array[i];

            if(Character.isLowerCase(currChar)) {
                currChar = Character.toUpperCase(currChar);
            }
            else {
                currChar = Character.toLowerCase(currChar);
            }

            System.out.print(currChar + " ");
        }
        
    }
}