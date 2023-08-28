package java.springfirstapplication.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.springfirstapplication.Dto.CementRequestDto;
import java.springfirstapplication.Dto.CementResponseDto;
import java.springfirstapplication.Entity.Cement;
import java.springfirstapplication.Repository.CementRepository;
import java.springfirstapplication.Service.CementService;
import java.springfirstapplication.Service.CementServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/v1/api/cement")
@RequiredArgsConstructor
public class CementController {

    private final CementServiceImpl cementServiceImpl;

    @GetMapping
    public List<CementResponseDto> findAll() {
        return cementServiceImpl.findAll();
    }

    @PostMapping
    public void create(@RequestBody CementRequestDto cementRequestDto) {
        cementServiceImpl.create(cementRequestDto);
    }

    @GetMapping("/{id}")
    public CementResponseDto getCementById(@PathVariable Long id) {
        return cementServiceImpl.getCementById(id);

    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CementRequestDto cementRequestDto) {
        cementServiceImpl.update(id, cementRequestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        cementServiceImpl.delete(id);
    }
}
