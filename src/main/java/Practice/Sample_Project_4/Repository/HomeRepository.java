package Practice.Sample_Project_4.Repository;

import Practice.Sample_Project_4.Entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Integer> {

}
