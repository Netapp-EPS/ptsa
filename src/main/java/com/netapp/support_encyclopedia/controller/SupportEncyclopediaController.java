package com.netapp.support_encyclopedia.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netapp.support_encyclopedia.dao.ModuleDAO;
import com.netapp.support_encyclopedia.dao.ProductDAO;
import com.netapp.support_encyclopedia.dao.SubModuleDAO;
import com.netapp.support_encyclopedia.dao.VersionDAO;
import com.netapp.support_encyclopedia.model.DataCollection;
import com.netapp.support_encyclopedia.model.Module;
import com.netapp.support_encyclopedia.model.Product;
import com.netapp.support_encyclopedia.model.SubModule;
import com.netapp.support_encyclopedia.model.Version;
import com.netapp.support_encyclopedia.util.Result;


@RestController
@RequestMapping("/product")
@Transactional
public class SupportEncyclopediaController {
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private VersionDAO versionDAO;
	@Autowired
	private ModuleDAO moduleDAO;
	@Autowired
	private SubModuleDAO subModuleDAO;
	
	
	
	@RequestMapping("/addProduct")
	public Result addProduct(@RequestParam("product") Product product){
		productDAO.saveOrUpdateProduct(product);
		Result result=new Result();
		result.setMessage("Product added successfully");
		return result;
	}
	
	@RequestMapping("/addProductVersions")
	public Result addVersion(@RequestParam("versions") List<Version> versionList){
		//TODO: Add code to add versions to a given product
		Result result=new Result();
		result.setMessage("Version Added successfully");
		return result;
	}
	
	@RequestMapping("/addProductModules")
	public Result addProductModules(@RequestParam("modules") List<Module> moduleList){
		//TODO: Add code to add modules for a given product and version
		Result result=new Result();
		result.setMessage("Modules added successfully");
		return result;
	}
	
	@RequestMapping("/addProductSubModules")
	public Result addProductSubModules(@RequestParam("subModules") List<SubModule> subModuleList){
		//TODO: Add code to add submodules for a given product,version and Modules
		Result result=new Result();
		result.setMessage("SubModules Added successfully");
		return result;
	}
	
	@RequestMapping("/addDataCollectionSteps")
	public Result addDataCollectionSteps(@RequestParam("dataCollectionSteps") DataCollection dataCollection){
		//TODO: Add code to add datacollection for a given module and product
		Result result=new Result();
		result.setMessage("Datacollection Steps  Added successfully");
		return result;
	}
	
	@RequestMapping(value="/allProducts",produces="application/json",method=RequestMethod.POST)
	public List<Product> getAllProducts(){
		List<Product> allProduct=productDAO.getAllProducts();
				return allProduct;
		
	}

	@RequestMapping(value="/allProductVersions",produces="application/json",method=RequestMethod.POST,consumes={"text/plain", "application/*"})
	public List<Version> getAllProductVersion(@RequestParam("productId") String productId){
		return versionDAO.getVersions(BigInteger.valueOf(Long.valueOf(productId)));
	}
	
	@RequestMapping(value ="/allProductModules",produces="application/json",method=RequestMethod.POST,consumes={"text/plain", "application/*"})
	public List<Module> getAllProductModules(@RequestParam("versionId") String versionId){
		
		return moduleDAO.getModule(BigInteger.valueOf(Long.valueOf(versionId)));
	}
	
	@RequestMapping(value="/allProductSubModules",produces="application/json",method=RequestMethod.POST,consumes={"text/plain", "application/*"})
	public List<SubModule> getAllSubModules(@RequestParam("moduleId") String moduleId){
		return subModuleDAO.getSubModule(BigInteger.valueOf(Long.valueOf(moduleId)));
	}
	
	@RequestMapping("/moduleDataCollectionSteps")
	public DataCollection getModuleDataCollection(@RequestParam("productId") long productId,@RequestParam("versionId") long versionId,@RequestParam("moduleId") long moduleId){
		//TODO: Add code to fetch the datacollection step record from Datacollection table for a gven product,version and module 
		return new DataCollection();
	}
	

}
