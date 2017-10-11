public class Student extends SchoolPeople {
    private int nrIndeksu;
    private int yearOfStudies;

    public Student(String firstName, String lastName, int nrIndeksu, int yearOfStudies) {
        super(firstName, lastName);
        this.nrIndeksu = nrIndeksu;
        this.yearOfStudies = yearOfStudies;
    }

    public Student(int nrIndeksu, int yearOfStudies) {
        this.nrIndeksu = nrIndeksu;
        this.yearOfStudies = yearOfStudies;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Numer indeksu: "+nrIndeksu+"; rok studiów: "+yearOfStudies);
    }
}
