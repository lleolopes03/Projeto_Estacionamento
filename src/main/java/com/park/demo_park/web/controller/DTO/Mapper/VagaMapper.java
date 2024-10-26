package com.park.demo_park.web.controller.DTO.Mapper;

import com.park.demo_park.entities.Vaga;
import com.park.demo_park.web.controller.DTO.VagaCreateDto;
import com.park.demo_park.web.controller.DTO.VagaResponseDto;
import jakarta.persistence.Access;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VagaMapper {
    public static Vaga toVaga(VagaCreateDto dto) {
        return new ModelMapper().map(dto, Vaga.class);
    }

    public static VagaResponseDto toDto(Vaga vaga) {
        return new ModelMapper().map(vaga, VagaResponseDto.class);
    }

}
