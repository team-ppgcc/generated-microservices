package br.uece.ppgcc.orchestrator.controller;

import br.uece.ppgcc.orchestrator.dto.ProgramaDTO;
import br.uece.ppgcc.orchestrator.services.ProgramaRestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OrchestratorController {

    private ProgramaRestClientService programaRestClientService;

    public OrchestratorController(ProgramaRestClientService programaRestClientService) {
        this.programaRestClientService = programaRestClientService;
    }

    @GetMapping("/spc_GetProgramaByCod/{prgcod}")
    public List<ProgramaDTO> spc_GetProgramaByCod(
            @PathVariable(value = "prgcod") String prgcod) {
        List<ProgramaDTO> retorno = null;
        retorno = getProgramaByCodPrograma(prgcod);

        return retorno;
    }


    private List<ProgramaDTO> getProgramaByCodPrograma(String prgcod) {
        return programaRestClientService.getProgramaByCod(prgcod);
    }

}
