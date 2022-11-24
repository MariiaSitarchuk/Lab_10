package adapter.task_3;

public class Authorization  {
    public boolean log_in(Database database) {
        database.getUserInfo();
        return true;
    }
}
