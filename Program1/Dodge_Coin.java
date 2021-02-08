package Program1;

class Dodge_Coin extends Person {

    String type;

    public Dodge_Coin(String name, int bornYear, String type) {
        super(name, bornYear);
        this.type = type;
    }

    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a money with fun and My type is " + type + " coin.");
    }

}
