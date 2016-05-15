package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private MainService mainService;

    @RequestMapping("")
    public String[] getGreetings() {
        return mainService.getGreetings();
    }
}
