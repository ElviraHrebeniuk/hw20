import java.util.Objects;

public class Task {
    private int number;
    private String title;
    private String description;

    public Task(int number, String title, String description) {
        this.number = number;
        this.title = title;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return number == task.number && Objects.equals(title, task.title) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "number=" + number + ", title='" + title + ", description='" + description  + '}';
    }
}
