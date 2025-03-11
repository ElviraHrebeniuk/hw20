import java.util.List;
import java.util.Objects;

public class Programmer {
    private  String name;
    private  List<Task> tasks;

    public Programmer(String name) {
        this.name = name;
       // this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public  List<Task> getTasks() {
        return tasks;
    }

    public  void addTask(Task task){
       tasks.add(task));
  }
 public  void deleteTask(Task task){
     for (int i = 0; i < tasks.size(); i++) {
         if (tasks.get(i).equals(task)) tasks.remove(i);
     }
 }
 public  boolean findTask(Task task){
     boolean result = false;

     for (int i = 0; i < tasks.size(); i++) {
         if (tasks.get(i).equals(task)) result = true;
     }
     return result;
 }
 public  boolean findTaskByNumber(int taskNumber){
        boolean result = false;

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getNumber() == taskNumber) result = true;
        }
        return result;
    }
    public  List<Task> allTasks(){
        return tasks;
    }

    @Override
    public String toString() {
        return "Programmer " + name + " (количество задач: " + tasks.size() + ")";
    }

    public   boolean getTask(Task task){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task))
                return true;
        }
        return false;
    }
}
