import java.util.LinkedList;

public class ToDoList {
    private LinkedList<Task> tasks = new LinkedList<>();

    // Add a task to the end of the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Perform (and remove) the first task in the list (first-in-first-out!)
    public void performTask() {
        if (!tasks.isEmpty()) {
            Task task = tasks.removeFirst();
            System.out.println("Performing Task: " + task);
        } else {
            System.out.println("No tasks to perform.");
        }
    }

    // Print all tasks in the list
    public void printTasks() {
        System.out.println("To-Do List:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.addTask(new Task("Finish homework"));
        list.addTask(new Task("Buy groceries"));
        list.addTask(new Task("Clean the house"));

        list.printTasks();
        list.performTask(); // Should perform "Finish homework"
        list.performTask(); // Should perform "Buy groceries"
        list.printTasks(); // Should show remaining task "Clean the house"
    }
}
