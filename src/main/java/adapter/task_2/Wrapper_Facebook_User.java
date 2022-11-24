package adapter.task_2;

import java.time.LocalDate;

public class Wrapper_Facebook_User implements User{
    public FacebookUser user;
  
    public Wrapper_Facebook_User(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Country getCountry() {
        return user.getUserCountry();
    }

    @Override
    public LocalDate getLastDate() {
        return user.getGetUserActiveTime();
    }
}
