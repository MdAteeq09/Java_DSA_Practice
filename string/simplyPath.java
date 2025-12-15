import java.util.Stack;

public class simplyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.equals("") || part.equals(".")) {
                continue;
            } 
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(part);
            }
        }
        return "/" + String.join("/", stack);
    }
    public static void main(String[] args) {
        String str = "/../";
        System.out.println(simplifyPath(str));
    }
}
