package it.step.mapper;

import it.step.dto.ProvinceDTO;
import it.step.model.Province;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ProvinceMapper {

    ProvinceDTO provinceToProvinceDto(Province province);

    Province provinceDtoToProvince(ProvinceDTO provinceDto);
}
