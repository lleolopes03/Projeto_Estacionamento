package com.park.demo_park.web.controller.DTO.Mapper;

import com.park.demo_park.entities.Cliente;
import com.park.demo_park.web.controller.DTO.ClienteCreateDto;
import com.park.demo_park.web.controller.DTO.ClienteResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {
    public static Cliente toCliente(ClienteCreateDto dto) {
        return new ModelMapper().map(dto, Cliente.class);
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }

}
