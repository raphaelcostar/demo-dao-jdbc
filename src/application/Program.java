package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		
		System.out.println("=== TEST 3: seller findAll ===");
		List<Seller> listall = sellerDao.findAll();
		for(Seller obj : listall) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Raphael", "raphael@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted Id" + newSeller.getId());
		*/
	
		/*
		System.out.println("=== TEST 5: seller update ===");
		Seller updateSeller = new Seller(12,"Folukinha", "folukinha@gmail.com", new Date(), 4000.0, department);
		sellerDao.update(updateSeller);
		System.out.println(updateSeller);
		*/
		
		System.out.println("=== TEST 6: seller delete ===");
		System.out.print("Digite o Id do us�rio que voc� deseja deletar ");
		Integer id = sc.nextInt();
		Seller findById = sellerDao.findById(id);
		System.out.println(findById);
		sellerDao.deleteById(id);
		
		
		}
	}
	

