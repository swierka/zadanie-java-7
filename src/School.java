public class School {

    public static void main(String[] args) {
        Student student1 = new Student("Jan","Kowalski",728883,1);
        Student student2 = new Student("Tomek","Nowak",728884,1);

        Teacher teacher1 = new Teacher("Marek", "Keram","Fizyka kwantowa",16.5);
        Teacher teacher2 = new Teacher ("Jan", "Matłoka","Inżynieria finansowa", 19.7);

        System.out.println("Studenci:");
        student1.show();
        student2.show();
        System.out.println();
        System.out.println("Wykładowcy:");
        teacher1.show();
        teacher2.show();
    }
}
