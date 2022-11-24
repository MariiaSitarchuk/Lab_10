package adapter.task_2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

enum Country {
    Ukraine, USA, Poland;
}

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private Country country;
    private LocalDate lastActiveTime;
}
