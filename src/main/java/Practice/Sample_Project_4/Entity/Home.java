package Practice.Sample_Project_4.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Component
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Home {
    @Id
    private int id;
    private String name;
    private String address;
}
