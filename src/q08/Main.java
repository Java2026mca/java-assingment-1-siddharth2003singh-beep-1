import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "PUSH":
                    stack.push(Integer.parseInt(parts[1]));
                    break;

                case "POP":
                    if (stack.isEmpty())
                        System.out.println("EMPTY");
                    else
                        System.out.println(stack.pop());
                    break;

                case "PEEK":
                    if (stack.isEmpty())
                        System.out.println("EMPTY");
                    else
                        System.out.println(stack.peek());
                    break;

                case "SIZE":
                    System.out.println(stack.size());
                    break;
            }
        }
    }
}
