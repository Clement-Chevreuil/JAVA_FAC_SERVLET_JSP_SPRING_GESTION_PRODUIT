package com.example.application_entreprise_tp6.METIER;

import com.example.application_entreprise_tp6.DATA.Produit;

import java.util.List;

public interface ICatalogueMetier {

    public void add(Produit p);
    public Produit find(String ref);
    public List<Produit> findAll ();
    public void update(Produit p);
    public void delete(Produit p);

}
