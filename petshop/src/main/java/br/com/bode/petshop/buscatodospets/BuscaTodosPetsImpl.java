package br.com.bode.petshop.buscatodospets;

import br.com.bode.petshop.config.exception.DatabaseConnectionException;
import br.com.bode.petshop.repositories.PetRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuscaTodosPetsImpl implements IBuscaTodosPets {

    private final PetRepository petRepository;

    public BuscaTodosPetsImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Transactional
    @Override
    public List<PetResponse> busca() {

        try {
            List<PetResponse> petResponses = petRepository.findAll().stream()
                    .map(PetResponse::new)
                    .collect(Collectors.toList());

            return petResponses;
        }
        catch (Exception ex) {
            throw new DatabaseConnectionException(ex.getMessage());
        }

    }
}
