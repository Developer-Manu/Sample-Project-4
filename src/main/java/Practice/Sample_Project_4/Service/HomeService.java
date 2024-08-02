package Practice.Sample_Project_4.Service;

import Practice.Sample_Project_4.Entity.Home;
import Practice.Sample_Project_4.Repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;

    public List<Home> getHomes(){
        return homeRepository.findAll();
    }


    public Home getHome(int id){
        return homeRepository.findById(id).get();
    }


    public void addHome(Home home){
        homeRepository.save(home);
    }
}
