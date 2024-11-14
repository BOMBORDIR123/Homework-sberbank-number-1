public abstract class Parent {
    private String Name;

    //статический блок, выводящий на экран «Parent:static 1»
    static {
        System.out.println("Parent:static 1");
    }

    //нестатический блок, выводящий на экран «Parent:instance 1»
    {
        System.out.println("Parent:instance 1");
    }

    //статический блок, выводящий на экран «Parent:static 2»
    static {
        System.out.println("Parent:static 2");
    }

    //конструктор без параметров, выводящий на экран «Parent:constructor»
    public Parent() {
        System.out.println("Parent:constructor");
    }

    //нестатический блок, выводяший на экран «Parent:instance 2»
    {
        System.out.println("Parent:instance 2");
    }

    //конструктор с параметром Name, выводящий на экран «Parent:name-constructor»
    public Parent(String name) {
        Name = name;
        System.out.println("Parent:name-constructor");
    }
}
