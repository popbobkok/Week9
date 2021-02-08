package Program1;

class Prime_minister extends Person {

    String country;

    public Prime_minister(String name, int bornYear, String country) {
        super(name, bornYear);
        this.country = country;
    }

    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a prime minister and work in " + country + ".");
    }

}
