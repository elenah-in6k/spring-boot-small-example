package example;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String[] getGreetings() {
        return new String[]{"Hi", "Hello", "How are you?"};
    }
}
