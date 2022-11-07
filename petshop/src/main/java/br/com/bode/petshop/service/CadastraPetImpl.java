package br.com.bode.petshop.service;

import br.com.bode.petshop.controller.dto.NovoPetRequest;
import br.com.bode.petshop.controller.dto.NovoPetResponse;
import br.com.bode.petshop.domain.Pet;
import org.springframework.stereotype.Service;

@Service
public class CadastraPetImpl implements ICadastraPet {
    @Override
    public NovoPetResponse cadastra(NovoPetRequest novoPetRequest) {
        Pet pet = novoPetRequest.toModel();
        NovoPetResponse response = new NovoPetResponse(pet);

        return response;
    }
}
