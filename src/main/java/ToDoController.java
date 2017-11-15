import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    public String someBusiness = "get breakfast at 9 am";
    @RequestMapping("/todo")
    public ToDo toDo(){
        return new ToDo(someBusiness);
    }
}
