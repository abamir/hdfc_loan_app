public class user {

    int i = 10;

    boolean isActive = true;

    int j = 20;
    String name = "Amir";
    int id = 101;

    // Updated upstream
    // JIRA - 102
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Is Active: " + isActive);
        System.out.println("I: " + i);
        System.out.println("J: " + j);

    }

    // JIRA - 101
    public void add() {
        System.out.println("Add method called");
    }
    // Stashed changes
}
