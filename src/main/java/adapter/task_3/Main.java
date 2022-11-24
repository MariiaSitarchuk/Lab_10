package adapter.task_3;

public class Main {
    public static void main(String[] args) {
        DataBase database = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.log_in(database)) {
            ReportBuilder br = new ReportBuilder(database);
        }
    }
}
