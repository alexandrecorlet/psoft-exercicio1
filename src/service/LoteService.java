package service;

import java.util.Collection;
import java.util.Date;

import data.Lote;
import data.Produto;
import repository.LoteRepository;

public class LoteService {

    private final LoteRepository loteRepository;

    public LoteService() {
        this.loteRepository = new LoteRepository();
    }

    public String criarLote(Produto p, int quantidade, Date dataDeValidade) {
        Lote l = new Lote(p, quantidade, dataDeValidade);
        return loteRepository.adicionarLote(l);
    }

    public String removerLote(String id) {
        return loteRepository.removerLote(id);
    }

    public Lote consultarLote(String idLote) {
        return loteRepository.consultarLote(idLote);
    }

    public Collection<Lote> listarLotes() {
        return loteRepository.listarLotes();
    }

}
