package com.example.application_entreprise_tp6.DAO;

import com.example.application_entreprise_tp6.DATA.Produit;

import java.util.*;

public class CatalogueDAOImpl implements ICatalogueDAO {
    private Map<String, Produit> RepoProduits = new HashMap<String, Produit>();
    public void addProduit(Produit p) {
        RepoProduits.put(p.getReference(), p);

    }

    public List<Produit> getAllProduits() {
        Collection<Produit> res= RepoProduits.values();
        return new ArrayList<Produit>(res);
    }

    public Produit getProduit(String ref) {

        return RepoProduits.get(ref);
    }

    public void updateProduit(Produit p) {
        RepoProduits.put(p.getReference(),p);

    }

    public void deleteProduit(Produit p) {
        RepoProduits.remove(p.getReference());

    }

    public void init()
    {
        addProduit(new Produit("HP675","Ordinateur HP",1800,5));
        addProduit(new Produit("IL65","Imprimante Laser",770,50));
        addProduit(new Produit("SamS10","Smart Phone",800,8));
    }
}
