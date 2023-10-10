
import Generic_class.Stack   ;
public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        try {
            System.out.println(stack.search(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        try {
            for (int i = 0; i < 11; i++) {
                stack.push(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        try {
            System.out.println(stack.search(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        try {
            System.out.println(stack.search(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }

    }
}