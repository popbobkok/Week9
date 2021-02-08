package Program1;

class Teacher extends Person {

    String university;

    public Teacher(String name, int bornYear, String university) {
        super(name, bornYear);
        this.university = university;
    }

    // overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and teach the students in " + university + ".");
    }

}
