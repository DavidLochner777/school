package School;

public class student {
    private String name;
    private int ID;
    private int student_amount = 0;
    private static int NextID = 100;
    public student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        student_amount++;
    }
    public student(String name) {
        this(name, NextID++);
    }
    public void name_change(String name) {
        this.name = name;
    }
    public boolean precedesByID(student student2) {
        if(this.ID <= student2.ID) {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        return name + " has ID: " + ID;
    }
}
