package effective.builder;

public class Run {
    public static void main(String[] args) {
        Person s = new Person
            .Builder("ss")
            .age(32)
            .email("shinilhyun")
            .tall(186)
            .build();
        System.out.println(s.toString());
    }
}
