package br.com.bode.petshop.buscapetpeloid;

import br.com.bode.petshop.domain.Pet;
import br.com.bode.petshop.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class BuscaPetPeloIdImpl implements IBuscaPetPeloId {

    private final PetRepository petRepository;

    public BuscaPetPeloIdImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public PetFullResponse buscaPelo(Long id) {
        Optional<Pet> optionalPet = petRepository.findById(id);

        if (optionalPet.isEmpty()) {
            throw new IllegalArgumentException("Not found id " + id);
        }

        Pet pet = optionalPet.get();
        return new PetFullResponse(pet);
    }
}
