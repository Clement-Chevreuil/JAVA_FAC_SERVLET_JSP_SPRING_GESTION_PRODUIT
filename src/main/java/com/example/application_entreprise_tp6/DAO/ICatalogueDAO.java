package com.example.application_entreprise_tp6.DAO;

import com.example.application_entreprise_tp6.DATA.Produit;

import java.util.List;

public interface ICatalogueDAO {
    public void addProduit (Produit p);

    public List<Produit> getAllProduits();
    public Produit getProduit(String ref);
    public void updateProduit (Produit p);
    public void deleteProduit (Produit p);

}
