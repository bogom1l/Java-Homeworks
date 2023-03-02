package bg.tu_varna.sit.task06;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 *  така че да променят стойностите на първоначални масив според операциите:
 *
 *  <операция> <index> <value>
 *
 *      където <операция> е действието което трябва да се изпълни
 *      <index> върху кой елемент на масива трябва да се изпълни действието и <value> втория операнд в операцията
 *
 *      Очакван резултат:
 *      2 0 11  999 11
 */

public class Main {
    public static void main(String[] args) {

        long[] array = {3, 0, 9, 333, 11};

        String[] commands = {
                "add 2 2",
                "subtract 1 1",
                "multiply 3 3",
                "stop",
        };

        for (int i =0; i < commands.length; i++) {

            String[] stringParams = commands[i].split(" ");

            String action = stringParams[0];
            if(action == "stop") {
                break;
            }

            int[] params = new int[2];

            if(action.equals("add") || action.equals("subtract") || action.equals("multiply")) {
                params[0] = Integer.parseInt(stringParams[1]);
                params[1] = Integer.parseInt(stringParams[2]);

                Calculator.performAction(array, action, params);
            }

            ArrayWrapper.printArray(array);
            System.out.print('\n');
        }

    }
}
