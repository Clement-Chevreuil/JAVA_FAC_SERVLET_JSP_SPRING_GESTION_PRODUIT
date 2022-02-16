package com.example.application_entreprise_tp6.METIER;

import com.example.application_entreprise_tp6.DAO.ICatalogueDAO;
import com.example.application_entreprise_tp6.DATA.Produit;

import java.util.List;

public class CatalogueMetierImpl implements ICatalogueMetier {
    private ICatalogueDAO dao;


    public void setDao(ICatalogueDAO dao) {
        this.dao = dao;
    }

    public void add(Produit p) {

        dao.addProduit(p);
    }

    public Produit find(String ref) {

        return dao.getProduit(ref);
    }

    public List<Produit> findAll() {

        return dao.getAllProduits();
    }

    public void update(Produit p) {
        dao.updateProduit(p);

    }

    public void delete(Produit p) {
        dao.deleteProduit(p);

    }
}
