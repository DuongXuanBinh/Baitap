package Java.Lab10.ex2;

public class Bigdog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woowwwwwwwwww!");
    }
}
