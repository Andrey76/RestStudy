import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by andr_ on 15.11.2017.
 */
public class ToDo {
    private String business;
    @ManyToOne
    @JoinColumn(name = "business_id")
    private GroupToDo groupTodo;

    public ToDo() {
    }

    public ToDo(String business) {
        this.business = business;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "business='" + business + '\'' +
                '}';
    }
}
