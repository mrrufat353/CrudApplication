package java.springfirstapplication.Service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.springfirstapplication.Dto.CementRequestDto;
import java.springfirstapplication.Dto.CementResponseDto;
import java.springfirstapplication.Entity.Cement;
import java.springfirstapplication.Repository.CementRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CementService implements CementServiceImpl {

    private final ModelMapper modelMapper;
    private final CementRepository cementRepository;

    @Override
    public List<CementResponseDto> findAll() {
        return cementRepository
                .findAll()
                .stream()
                .map(cement -> modelMapper.map(cement, CementResponseDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public void create(CementRequestDto cementRequestDto) {
        Cement cement = modelMapper.map(cementRequestDto, Cement.class);
        cementRepository.save(cement);
    }

    @Override
    public CementResponseDto getCementById(Long id) {
        Cement cement = cementRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return modelMapper.map(cement, CementResponseDto.class);
    }

    @Override
    public void update(Long id, CementRequestDto cementRequestDto) {
        Cement cement = cementRepository.findById(id).get();
        cement.setCementKlass(cementRequestDto.getCementKlass());
        cement.setType(cementRequestDto.getType());
        cement.setName(cementRequestDto.getName());
        cement.setWeight(cementRequestDto.getWeight());
        cement.setMakerName(cementRequestDto.getMakerName());
        cement.setOrderOfUse(cementRequestDto.getOrderOfUse());
        cement.setYear(cementRequestDto.getYear());
        cementRepository.save(cement);
    }

    @Override
    public void delete(Long id){
        cementRepository.deleteById(id);
    }
}
