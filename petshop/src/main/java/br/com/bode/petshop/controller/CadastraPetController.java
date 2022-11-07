package br.com.bode.petshop.controller;

import br.com.bode.petshop.controller.dto.NovoPetRequest;
import br.com.bode.petshop.controller.dto.NovoPetResponse;
import br.com.bode.petshop.domain.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pet/cadastro")
public class CadastraPetController {

    @PostMapping
    public ResponseEntity<NovoPetResponse> cadastra(@RequestBody NovoPetRequest request) {
        Pet pet = request.toModel();
        NovoPetResponse response = new NovoPetResponse(pet.getNome(), pet.getTipoDePet(), pet.getDono());

        return ResponseEntity.ok(response);
    }

}
