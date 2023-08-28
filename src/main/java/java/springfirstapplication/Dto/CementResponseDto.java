package java.springfirstapplication.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CementResponseDto {

    private Long id;

    private String name;

    private String type;

    private String makerName;

    private String weight;

    private String cementKlass;

    @JsonFormat(pattern = "dd.MM.yyy")
    private LocalDate year;

}
