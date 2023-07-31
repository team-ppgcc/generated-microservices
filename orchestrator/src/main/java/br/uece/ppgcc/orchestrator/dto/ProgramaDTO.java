package br.uece.ppgcc.orchestrator.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProgramaDTO {

    private String code;
    private String sigla;
    private String description;
}

