package effective.builder;

public class Person {
    private String name;
    private int age;
    private String job;
    private float tall;
    private float weight;
    private String email;

    private Person() {
    }

    static class Builder{
        private String name;
        private int age;
        private String job;
        private float tall;
        private float weight;
        private String email;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder tall(float tall) {
            this.tall = tall;
            return this;
        }

        public Builder weight(float weight) {
            this.weight = weight;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

    public Person(Builder builder) {
        this.age = builder.age;
        this.email = builder.email;
        this.job = builder.job;
        this.name = builder.name;
        this.tall = builder.tall;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", job='" + job + '\'' +
            ", tall=" + tall +
            ", weight=" + weight +
            ", email='" + email + '\'' +
            '}';
    }
}
