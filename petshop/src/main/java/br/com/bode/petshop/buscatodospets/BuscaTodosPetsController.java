package br.com.bode.petshop.buscatodospets;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/pet")
public class BuscaTodosPetsController {

    private final IBuscaTodosPets iBuscaTodosPets;

    public BuscaTodosPetsController(IBuscaTodosPets iBuscaTodosPets) {
        this.iBuscaTodosPets = iBuscaTodosPets;
    }

    @GetMapping("/busca")
    public ResponseEntity<List<PetResponse>> buscaTodosPets() {

        List<PetResponse> petResponseList = iBuscaTodosPets.busca();

        return ResponseEntity.ok(petResponseList);
    }


}
