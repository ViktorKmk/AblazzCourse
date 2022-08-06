package Homeworks.Homework4.ExpertTask1;

public class Expert1 {
    public static void main(String[] args) {
        Human human1 = Human.builder().name("Петр").age(20).weight(80).build();
        Human human2 = Human.builder().name("Иван").age(16).build();
        Human human3 = Human.builder().name("Олег").weight(74.8).build();
        human1.info();
        human2.info();
        human3.info();
    }
}
