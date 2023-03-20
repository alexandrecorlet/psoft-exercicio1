package repository;

import java.util.Map;
import java.util.HashMap;

import data.Lote;

public class LoteRepository {

    private Map<String, Lote> loteRepository;

    public LoteRepository() {
        this.loteRepository = new HashMap<>();
    }

    public Lote adicionarLote(Lote l) {
        String id = l.getID();
        loteRepository.put(id, l);
        return id;
    }

    public Lote recuperaLote(Lote l) {
        return loteRepository.get(l.getID());
    }

}
