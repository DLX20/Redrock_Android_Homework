import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyCalculate {
    private String calculate;

    public MyCalculate(String num) {
        calculate = num;
    }

    Stack<Integer> nStack = new Stack<>();
    Stack<Character> sStack = new Stack<>();
    Stack<Integer> number = new Stack<>();
    List<String> cNum = new ArrayList<>();

    public void calculate() {
        turns();
        for (int i = 0; i < cNum.size(); i++) {
            String c = cNum.get(i);

            //运算符
            if (!isOperator(c.charAt(0))) {
                int num = Integer.parseInt(c);
                nStack.push(num);
                continue;
            }

            //操作符
            else if (isOperator(c.charAt(0))) {
                if (c.charAt(0) == ')') {
                    while (sStack.peek() != '(') {
                        setCalculate();
                    }
                    if (sStack.peek() == '(') {
                        sStack.pop();
                        continue;
                    }
                } else if (sStack.empty() || c.charAt(0) == '(' || priority(c.charAt(0)) > priority(sStack.peek())) {
                    sStack.push(c.charAt(0));
                    continue;
                } else if (priority(c.charAt(0)) <= priority(sStack.peek())) {
                    while (true) {
                        setCalculate();
                        if (sStack.empty()||priority(c.charAt(0))>priority(sStack.peek())) {
                            sStack.push(c.charAt(0));
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
                try {
                nStack.push(b / a);
                }catch (Exception e){
                    e.printStackTrace();
                }
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

    public Boolean isNumber(Character c) {
        if (c >= '0' && c <= '9')
            return true;
        else
            return false;
    }

    public Boolean isOperator(Character c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == ')' || c == '(' || c == '=')
            return true;
        else
            return false;
    }


    public void turns(){
        for (int i = 0; i <calculate.length() ; i++) {
            char c = calculate.charAt(i);
            if(isNumber(c)) {
                number.push(c-'0');
            }
            else if (isOperator(c)){
                String ch=toChar();
                if (!ch.equals("0")) {
                    cNum.add(ch);
                    cNum.add(String.valueOf(c));
                }
                else
                    cNum.add(String.valueOf(c));
            }
        }
    }


    public String toChar(){
        int i=0;
        int num=0;
        while (!number.empty()){
            num = num+(number.pop()*(int)Math.pow(10,i));
            i++;
        }
        return String.valueOf(num);
    }

}

//      3+9/(1+2)-1=
//      16+4/(1+1)*4-12=