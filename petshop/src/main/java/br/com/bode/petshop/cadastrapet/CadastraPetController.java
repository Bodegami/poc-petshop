package br.com.bode.petshop.cadastrapet;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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

        URI uri = UriComponentsBuilder.fromUriString(response.getId().toString()).build().toUri();
        logger.info("Novo pet: " + response.toString());
        return ResponseEntity.created(uri).body(response);
    }

}
