package adapter.task_2;

import java.time.LocalDate;

public class Wrapper_Twitter_User implements User{
    public TwitterUser user;
  
    public Wrapper_Twitter_User(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Country getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getLastDate() {
        return user.getLastActiveTime();
    }
}
