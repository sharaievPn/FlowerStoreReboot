package ucu.edu.apps.flowerstorereboot.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Transient;
import jakarta.persistence.Column;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.Period;


@Entity @Table
@NoArgsConstructor @Getter @Setter
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    @Transient
    private int age;
    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
