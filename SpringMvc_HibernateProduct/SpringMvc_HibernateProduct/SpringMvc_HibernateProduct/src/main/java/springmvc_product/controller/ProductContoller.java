package springmvc_product.controller;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc_product.model.Product;
import springmvc_product.service.ProductService;

@Controller
public class ProductContoller
{
	@Autowired
	private ProductService productService;
	
	//save
	@RequestMapping("/saveProduct")
	public ModelAndView saveProduct(HttpServletRequest req,HttpServletResponse res)
	{
		int productId=Integer.parseInt(req.getParameter("productId"));
		String productName=req.getParameter("productName");
		int productPrice=Integer.parseInt(req.getParameter("productPrice"));
		
		Product pro=new Product();
		pro.setProductId(productId);
		pro.setProductName(productName);
		pro.setProductPrice(productPrice);                      
		
		productService.saveProduct(pro);
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("message", "Successufully Inserted..!");
		mView.setViewName("success.jsp");
		return mView;
		
		
	}
	
	//display all products
	@RequestMapping("/displayProduct")
	public ModelAndView displayAll(HttpServletRequest req, HttpServletResponse res) throws Exception
	{
		List<Product> product = productService.displayProduct();	
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("product", product);
		mView.addObject("message", "Product Details....!");
		mView.setViewName("display.jsp");
		return mView;
		
		
	}
	//update
	@RequestMapping("/updateProduct")
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res)
	{
		int productId=Integer.parseInt(req.getParameter("productId"));
		String productName=req.getParameter("productName");
		int productPrice=Integer.parseInt(req.getParameter("productPrice"));
		
		productService.updateProduct(productId, productName, productPrice);
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("message", "Updated successfully..!");
		mView.setViewName("success.jsp");
		return mView;
	}
	
	
	//update
	@RequestMapping("/deletProduct")
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res)
	{
		int productId=Integer.parseInt(req.getParameter("productId"));
		
		productService.deleteProduct(productId);
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("message", "Deleted successfully..!");
		mView.setViewName("success.jsp");
		return mView;
	}

}
