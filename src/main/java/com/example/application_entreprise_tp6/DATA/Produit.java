package com.example.application_entreprise_tp6.DATA;

public class Produit {
    private String reference, designation ;
    private double prix;
    private int quantite;
    public Produit() {

    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public Produit(String reference, String designation, double prix, int quantite) {
        super();
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }
}
