package com.ar.edu.um.martin.library.service.mapper;

import com.ar.edu.um.martin.library.domain.Author;
import com.ar.edu.um.martin.library.service.dto.AuthorDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Author} and its DTO {@link AuthorDTO}.
 */
@Mapper(componentModel = "spring")
public interface AuthorMapper extends EntityMapper<AuthorDTO, Author> {}
