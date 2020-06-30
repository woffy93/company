package it.francesco.business.mappers;

import it.francesco.dal.entity.Dev;
import it.francesco.presentation.domain.dto.BadgeDto;
import it.francesco.presentation.domain.dto.DevDto;

import java.util.ArrayList;
import java.util.List;

public class DevMapper {
    public DevDto toDto(Dev entity){ //no time to setup something automatic like mapstruct
        //todo
        return new DevDto(entity.getCf(), 40000, new BadgeDto("1224")); //todo: fix
    }

    public List<DevDto> toDtos(List<Dev> enitities){
        List<DevDto> devDtos = new ArrayList<>();
        for(Dev entity : enitities){
            DevDto dto = toDto(entity);
            devDtos.add(dto);
        }
        return devDtos;
    }
}
