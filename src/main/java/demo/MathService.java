package demo;

public class MathService {
    MathUtil mathUtil;

    public MathService() {
        mathUtil = new MathUtil();
    }

    public int add(int a, int b) {
        return mathUtil.add(a, b);
    }
}
