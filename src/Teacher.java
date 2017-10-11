public class Teacher extends SchoolPeople {
    private String course;
    private double tenure;

    public Teacher(String firstName, String lastName, String course, double tenure) {
        super(firstName, lastName);
        this.course = course;
        this.tenure = tenure;
    }

    public Teacher(String course, double tenure) {
        this.course = course;
        this.tenure = tenure;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getTenure() {
        return tenure;
    }

    public void setTenure(double tenure) {
        this.tenure = tenure;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Wykładany przedmiot: "+course+"; staż pracy: "+tenure);
    }
}
