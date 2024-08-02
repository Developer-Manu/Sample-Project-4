package Practice.Sample_Project_4.Controller;

import Practice.Sample_Project_4.Entity.Home;
import Practice.Sample_Project_4.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/Homes")
    public List<Home> getAllHomes() {
        return homeService.getHomes();
    }


    @GetMapping("/Homes/{id}")
    public Home gettingHomeById(@PathVariable int id) {
        return homeService.getHome(id);
    }


    @PostMapping("/Home")
    public void addingHome(@RequestBody Home home) {
        homeService.addHome(home);
    }

}
