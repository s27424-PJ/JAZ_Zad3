package org.example.schroniskozwierzat;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AnimalMapper {

    @Mapping(target = "id", ignore = true)
    Animal mapToAnimal(AnimalRequest request);

    AnimalResponse mapEntityToResponse(Animal entity);

    @Mapping(target = "id", ignore = true)
    Animal update(AnimalRequest request, @MappingTarget Animal animal);
}
