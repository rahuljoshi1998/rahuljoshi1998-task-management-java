public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    // Basic Constructor
    public Task(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = false;
    }
}
