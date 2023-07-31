package br.uece.ppgcc.orchestrator.services;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.uece.ppgcc.orchestrator.dto.ProgramaDTO;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "programa")
public interface ProgramaRestClientService {

    @GetMapping("/get-programa-by-cod/{prgcod}")
    public List<ProgramaDTO> getProgramaByCod(
        @PathVariable(value = "prgcod") String prgcod);

}

