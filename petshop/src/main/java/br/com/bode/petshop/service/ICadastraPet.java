package br.com.bode.petshop.service;

import br.com.bode.petshop.controller.dto.NovoPetRequest;
import br.com.bode.petshop.controller.dto.NovoPetResponse;
import org.springframework.stereotype.Component;


public interface ICadastraPet {

    NovoPetResponse cadastra(NovoPetRequest novoPetRequest);

}
