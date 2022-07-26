package it2.develhope.firstAPI03.DTO;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class StringsDTO {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Mandatory")
    private String stringMandatory;
    private String stringOptional;

}
