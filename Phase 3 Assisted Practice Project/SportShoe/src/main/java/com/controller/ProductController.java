package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;
import com.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	//Product Managemenet
	@RequestMapping(value="/productmgmt", method=RequestMethod.GET)
	public String productManagement()
	{
		return "productmanagement";
	}
	
	//Add Product
	@RequestMapping(value="/showaddproduct", method=RequestMethod.GET)
	public ModelAndView showAddProduct()
	{
		return new ModelAndView("addproduct", "product", new Product());
	}
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product, Model model)
	{
		productService.addProduct(product);
		model.addAttribute("success", "success");
		return "addproduct";
	}
	
	//Find By Id
	@RequestMapping(value="/showfindbyidproduct", method=RequestMethod.GET)
	public ModelAndView showFindByIdProduct()
	{
		return new ModelAndView("findbyidproduct", "product", new Product());
	}
	
	@RequestMapping(value="/findbyidproduct", method=RequestMethod.POST)
	public String findByIdProduct(@ModelAttribute("product") Product product, Model model)
	{
		Product productdb = productService.findById(product.getId());
		
		if(productdb == null)
		{
			model.addAttribute("failure", "failure");
		}
		else
		{
			model.addAttribute("productdb", productdb);
		}
		return "findbyidproduct";
	}
	
	//Find By Name
	@RequestMapping(value="/showfindbynameproduct", method=RequestMethod.GET)
	public ModelAndView showFindByNameProduct()
	{
		return new ModelAndView("findbynameproduct", "product", new Product());
	}
	
	@RequestMapping(value="/findbynameproduct", method=RequestMethod.POST)
	public String findByNameProduct(@ModelAttribute("product") Product product, Model model)
	{
		List<Product> productdb = productService.findByProdname(product.getProdname());
		
		if(productdb.isEmpty())
		{
			model.addAttribute("failure", "failure");
		}
		else
		{
			model.addAttribute("productdb", productdb);
		}
		return "findbynameproduct";
	}
	
	//Find By Category
	@RequestMapping(value="/showfindbycategoryproduct", method=RequestMethod.GET)
	public ModelAndView showFindByCategoryProduct()
	{
		return new ModelAndView("findbycategoryproduct", "product", new Product());
	}
	
	@RequestMapping(value="/findbycategoryproduct", method=RequestMethod.POST)
	public String findBycategoryProduct(@ModelAttribute("product") Product product, Model model)
	{
		List<Product> productdb = productService.findByCategory(product.getCategory());
		
		if(productdb.isEmpty())
		{
			model.addAttribute("failure", "failure");
		}
		else
		{
			model.addAttribute("productdb", productdb);
		}
		return "findbycategoryproduct";
	}
	
	//Update Product
	@RequestMapping(value="/showupdateproduct", method=RequestMethod.GET)
	public ModelAndView showUpdateProduct()
	{
		return new ModelAndView("updateproduct", "product", new Product());
	}
	
	@RequestMapping(value="/updateproduct", method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product product, Model model)
	{
		productService.updateProduct(product.getId(), product);
		model.addAttribute("success", "success");
		return "updateproduct";
	}
	
	//Delete Product
	@RequestMapping(value="/showdeleteproduct", method=RequestMethod.GET)
	public ModelAndView showDeleteProduct()
	{
		return new ModelAndView("deleteproduct", "product", new Product());
	}
	
	@RequestMapping(value="/deleteproduct", method=RequestMethod.POST)
	public String deleteProduct(@ModelAttribute("product") Product product, Model model)
	{
		productService.deleteProduct(product.getId());
		model.addAttribute("success", "success");
		return "deleteproduct";
	}
	
	//Find All Product
	@RequestMapping(value="/getallproduct")
	public String findAllProduct(Model model)
	{
		List<Product> products = productService.findAllProduct();
		model.addAttribute("products", products);
		return "allproduct";
	}
}
