package br.com.bode.petshop.buscapetpeloid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pet")
public class BuscaPetPeloIdController {

    private final IBuscaPetPeloId iBuscaPetPeloId;

    public BuscaPetPeloIdController(IBuscaPetPeloId iBuscaPetPeloId) {
        this.iBuscaPetPeloId = iBuscaPetPeloId;
    }

    @GetMapping("/busca/{id}")
    public ResponseEntity<PetFullResponse> buscaPelo(@PathVariable Long id) {

        PetFullResponse response = iBuscaPetPeloId.buscaPelo(id);
        return ResponseEntity.ok(response);
    }



}
