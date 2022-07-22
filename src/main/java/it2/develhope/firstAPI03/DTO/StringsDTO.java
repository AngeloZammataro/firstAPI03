package it2.develhope.firstAPI03.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StringsDTO {

    @NotBlank(message = "Mandatory")
    private String stringMandatory;
    private String stringOptional;
}
