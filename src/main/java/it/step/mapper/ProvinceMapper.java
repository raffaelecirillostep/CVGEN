package it.step.mapper;

import it.step.dto.ProvinceDto;
import it.step.model.Province;

public interface ProvinceMapper {

    ProvinceDto provinceToProvinceDto(Province province);

    Province provinceDtoToProvince(ProvinceDto provinceDto);
}
