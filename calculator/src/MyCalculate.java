import java.util.Stack;

public class MyCalculate {
    private String calculate;

    public MyCalculate(String num) {
        calculate = num;
    }

    Stack<Integer> nStack = new Stack<Integer>();
    Stack<Character> sStack = new Stack<Character>();

    public void calculate() {
        for (int i = 0; i < calculate.length(); i++) {
            char c = calculate.charAt(i);
            //System.out.println(c);

            //运算符
            if (isNumber(c)) {
                int num = c - '0';
                nStack.push(num);
                continue;
            }

            //操作符
            if (isOperator(c)) {
                if (c == ')') {
                    while (sStack.peek() != '(') {
                        setCalculate();
                    }
                    if (sStack.peek() == '(') {
                        sStack.pop();
                        continue;
                    }
                } else if (sStack.empty() || c == '(' || priority(c) > priority(sStack.peek())) {
                    sStack.push(c);
                    continue;
                } else if (priority(c) <= priority(sStack.peek())) {
                    while (true) {
                        setCalculate();
                        if (sStack.empty()) {
                            sStack.push(c);
                            break;
                        }
                    }
                    continue;
                }
            }
        }
        if (sStack.pop() == '=')
            System.out.println("计算结果:" + nStack.pop());
    }


    public void setCalculate() {
        int a = nStack.pop();
        int b = nStack.pop();
        switch (sStack.pop()) {
            case '+':
                nStack.push(b + a);
                break;
            case '-':
                nStack.push(b - a);
                break;
            case '*':
                nStack.push(b * a);
                break;
            case '/':
                nStack.push(b / a);
                break;
            default:
                break;
        }
    }


    public int priority(Character c) {
        if (c == '+' || c == '-')
            return 2;
        else if (c == '*' || c == '/')
            return 3;
        else if (c == '=')
            return 0;
        else if (c == '(')
            return 1;
        else
            System.out.println("请输入合法运算符");
        return -1;
    }

    public Boolean isNumber(char c) {
        if (c >= '0' && c <= '9')
            return true;
        else
            return false;
    }

    public Boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == ')' || c == '(' || c == '=')
            return true;
        else
            return false;
    }

}

//      3+9/(1+2)-1=