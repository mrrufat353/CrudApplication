package java.springfirstapplication.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CementRequestDto {

    private String name;

    private String type;

    private String makerName;

    private String weight;

    private String cementKlass;

    private String orderOfUse;

    private LocalDate year;
}
