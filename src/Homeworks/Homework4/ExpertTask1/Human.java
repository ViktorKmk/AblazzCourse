package Homeworks.Homework4.ExpertTask1;

public class Human {
    private String name;
    private int age;
    private double weight;

    private Human() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static class HumanBuilder {
        private final Human newHuman;

        public HumanBuilder() {
            newHuman = new Human();
        }

        public HumanBuilder name(String name) {
            newHuman.setName(name);
            return this;
        }

        public HumanBuilder age(int age) {
            newHuman.setAge(age);
            return this;
        }

        public HumanBuilder weight(double weight) {
            newHuman.setWeight(weight);
            return this;
        }

        public Human build() {
            return newHuman;
        }

    }

    public static HumanBuilder builder(){
        return new HumanBuilder();
    }

    // Петр - возраст 20, вес 80
    public void info() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) sb.append(this.name).append(" - ");
        if (this.age != 0) sb.append("возраст " + this.age + ", ");
        if (this.weight != 0) sb.append("вес " + String.format("%.2f",this.weight));
        System.out.println(sb);
    }
}
