package it.step.mapper;

import it.step.dto.ProvinceDTO;
import it.step.model.Province;

public interface ProvinceMapper {

    ProvinceDTO provinceToProvinceDto(Province province);

    Province provinceDtoToProvince(ProvinceDTO provinceDto);
}
