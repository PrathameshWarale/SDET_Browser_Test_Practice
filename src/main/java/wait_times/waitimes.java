package wait_times;

import java.time.Duration;

public class waitimes {

    public final Duration SHORT_WAIT = Duration.ofSeconds(Long.parseLong(System.getProperty("wait_short")));
}
