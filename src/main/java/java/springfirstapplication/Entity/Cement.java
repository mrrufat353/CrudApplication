package java.springfirstapplication.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cement")
public class Cement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private String makerName;

    private String weight;

    private String cementKlass;

    private String orderOfUse;

    @JsonFormat(pattern = "dd.MM.yyy")
    private LocalDate year;

}

