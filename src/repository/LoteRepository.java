package repository;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import data.Lote;

public class LoteRepository {

    private Map<String, Lote> loteRepository;

    public LoteRepository() {
        this.loteRepository = new HashMap<>();
    }

    public String adicionarLote(Lote l) {
        String id = l.getID();
        loteRepository.put(id, l);
        return id;
    }

    public Lote consultarLote(String idLote) {
        return loteRepository.get(idLote);
    }

    public Collection<Lote> listarLotes() {
        return loteRepository.values();
    }

}
