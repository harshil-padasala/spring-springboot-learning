package DependencyInjection.ConstructorInjection;

import java.util.List;

public class Person {
    private final String name;
    private final int personId;
    private final Certi certificate;

    private final List<String> list;

    public Person(String name, int personId, Certi certificate, List<String> list) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", list=" + list +
                '}';
    }
}
