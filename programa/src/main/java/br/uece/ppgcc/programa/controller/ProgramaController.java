package br.uece.ppgcc.programa.controller;


import br.uece.ppgcc.programa.repository.ProgramaRepository;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.uece.ppgcc.programa.dto.ProgramaDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProgramaController {

    private final ProgramaRepository repository;

    @GetMapping("/get-programa-by-cod/{prgcod}")
    public List<ProgramaDTO> getProgramaByCod(
        @PathVariable(value = "prgcod") String prgcod) {
        return repository.getProgramaByCod(prgcod);
    }

}

