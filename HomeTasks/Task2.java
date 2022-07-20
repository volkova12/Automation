package HomeTasks;

public class Task2 {
    public static String regex = "PERSON";
    public static void main(String[] args) {
        System.out.println(regex.matches("[A-Z]*"));
        System.out.println(regex.matches("[\0-9]"));
    }
}
