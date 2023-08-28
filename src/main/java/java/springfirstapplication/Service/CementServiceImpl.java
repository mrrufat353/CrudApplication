package java.springfirstapplication.Service;

import java.springfirstapplication.Dto.CementRequestDto;
import java.springfirstapplication.Dto.CementResponseDto;
import java.util.List;

public interface CementServiceImpl {

    void create(CementRequestDto cementRequestDto);

    CementResponseDto getCementById(Long id);

    List<CementResponseDto> findAll();

    void update(Long id, CementRequestDto cementRequestDto);

    void delete(Long id);
}
