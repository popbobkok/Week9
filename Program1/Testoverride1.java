package Program1;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1, person2, person3, person4, person5, person6;
        person1 = new Person("Mark", 2001);
        person2 = new Sheriff("Mateo", 1988, "California");
        person3 = new Footballer("Messi", 1987, "Bacelona");
        person4 = new Teacher("Ball", 1977, "CMU");
        person5 = new Prime_minister("Tu", 1954, "Thailand");
        person6 = new Dodge_Coin("Dodgecoin", 2013, "Cryptocurrency");

        person1.introduce();
        person2.introduce();
        person3.introduce();
        person4.introduce();
        person5.introduce();
        person6.introduce();
    }
}
