package adapter.task_2;

import java.time.LocalDate;

public class Main {
    public User login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClientWrapper(new TwitterUser("dobosevych", Country.Ukraine, LocalDate.of(2021, 11,11)));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClientWrapper(new FacebookUser("dobosevych", Country.Ukraine, LocalDate.of(2021, 11,11)));
        }
        return null;
    }
}
