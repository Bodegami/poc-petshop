package br.com.bode.petshop.controller;

import br.com.bode.petshop.controller.dto.NovoPetRequest;
import br.com.bode.petshop.controller.dto.NovoPetResponse;
import br.com.bode.petshop.domain.Pet;


import br.com.bode.petshop.service.ICadastraPet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/pet/cadastro")
public class CadastraPetController {

    private ICadastraPet iCadastraPet;
    private static Logger logger = Logger.getLogger("CadastraPetController.class");

    public CadastraPetController(ICadastraPet iCadastraPet) {
        this.iCadastraPet = iCadastraPet;
    }

    @PostMapping
    public ResponseEntity<NovoPetResponse> cadastra(@RequestBody @Valid NovoPetRequest novoPetRequest) {
        NovoPetResponse response = iCadastraPet.cadastra(novoPetRequest);

        logger.info("Novo pet: " + response.toString());
        return ResponseEntity.ok(response);
    }

}
