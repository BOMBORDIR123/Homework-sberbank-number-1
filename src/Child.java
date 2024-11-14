public class Child extends Parent {

    //статический блок, выводящий на экран «Child:static 1»
    static {
        System.out.println("Child:static 1");
    }

    //нестатический блок, выводящий на экран «Child:instance 1»
    {
        System.out.println("Child:instance 1");
    }

    //статический блок, выводящий на экран «Child:static 2»
    static {
        System.out.println("Child:static 2");
    }

    //конструктор без параметров, выводящий на экран «Child: constructor»
    public Child() {
        System.out.println("Child:constructor");
    }

    //конструктор с параметром Name, выводящий на экран «Child:name-constructon»
    public Child(String name) {
        super(name);
        System.out.println("Child:name-constructor");
    }

    //нестатический блок, выводящий на экран «Child instance 2»
    {
        System.out.println("Child:instance 2");
    }
}
