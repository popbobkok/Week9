package Program1;

class Footballer extends Person {

    String club;

    public Footballer(String name, int bornYear, String club) {
        super(name, bornYear);
        this.club = club;
    }

    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a football player and work in  " + club + "club.");
    }

}
