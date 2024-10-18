public class Student {
    private int id;
    private String name;
    private double marks;
    private String rank;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        setRank();
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getMarks() { return marks; }

    public void setMarks(double marks) { this.marks = marks; }

    public String getRank() { return rank; }

    public void setRank(String rank) { this.rank = rank; }

    void setRank() {
        if (marks >= 9.0) {
            rank = "Excellent";
        } else if (marks >= 7.5) {
            rank = "Very Good";
        } else if (marks >= 6.5) {
            rank = "Good";
        } else if (marks >= 5.0) {
            rank = "Medium";
        } else {
            rank = "Fail";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", rank='" + rank + '\'' +
                '}';
    }
}