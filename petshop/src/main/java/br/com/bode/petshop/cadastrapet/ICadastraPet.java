package br.com.bode.petshop.cadastrapet;

import br.com.bode.petshop.cadastrapet.NovoPetRequest;
import br.com.bode.petshop.cadastrapet.NovoPetResponse;


public interface ICadastraPet {

    NovoPetResponse cadastra(NovoPetRequest novoPetRequest);

}
