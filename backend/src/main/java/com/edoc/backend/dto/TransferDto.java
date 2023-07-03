package com.edoc.backend.dto;

import com.edoc.backend.enums.SchoolClass;
import com.edoc.backend.enums.Stream;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransferDto {

  private Long id;

  private UserDto user;

  private SchoolClass schoolClass;

  private Stream stream;

}
