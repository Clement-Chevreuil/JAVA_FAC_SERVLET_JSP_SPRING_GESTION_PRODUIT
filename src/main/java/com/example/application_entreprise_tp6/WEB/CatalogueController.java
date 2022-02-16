package com.example.application_entreprise_tp6.WEB;


import com.example.application_entreprise_tp6.DATA.Produit;
import com.example.application_entreprise_tp6.METIER.ICatalogueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CatalogueController {

	@Autowired
	private ICatalogueMetier metier;


	@RequestMapping("/")
	public String base(Model model)
	{
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metier.findAll());
		return "produits";
	}

	@RequestMapping("/index")
	public String index(Model model)
	{
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metier.findAll());
		return "produits";
	}
	@RequestMapping("/saveProduit")
	public String save(  Produit p , Model model)
	{
		metier.add(p);
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metier.findAll());
		return "produits";
	}
	
	@RequestMapping("/editProduit")
	public String edit( @RequestParam String ref , Model model)
	{
		
		model.addAttribute("produit", metier.find(ref));
		model.addAttribute("produits",metier.findAll());
		return "produits";
	}
	@RequestMapping("/deleteProduit")
	public String delete( @RequestParam String ref , Model model)
	{
		metier.delete(metier.find(ref));
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metier.findAll());
		return "produits";
	}
}
