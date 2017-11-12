package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Controller
public class GreetingController {

    String appName;

    @Autowired
    ChampionService championService;

    @PostConstruct
    public void init () {
        System.out.println("Init test");
        Champion irelia = new Champion();
        irelia.setChampion_name("irelia");
        irelia.setChampion_id(42);
        championService.insertChampion(irelia);
    }

    @RequestMapping("/greeting2")
    public String greeting2(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        appName = new String ("test");
        model.addAttribute("name", name);
        model.addAttribute("appname", appName);
        return "greeting2";
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        System.out.println("Received a new GREETING = " + greeting.getContent());
        return "result";
    }



}
