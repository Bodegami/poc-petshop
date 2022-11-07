package br.com.bode.petshop.cadastrapet;

import br.com.bode.petshop.domain.Pet;
import br.com.bode.petshop.repositories.PetRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CadastraPetImpl implements ICadastraPet {

    private final PetRepository petRepository;

    public CadastraPetImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Transactional
    public NovoPetResponse cadastra(NovoPetRequest novoPetRequest) {
        Pet pet = novoPetRequest.toModel();
        petRepository.save(pet);
        NovoPetResponse response = new NovoPetResponse(pet);

        return response;
    }
}
