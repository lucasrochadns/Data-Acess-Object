package application;

import java.time.LocalDateTime;
import java.util.List;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDAO;

public class Program {
	public static void main(String[] args) {
        
		SellerDAO SDAO = DaoFactory.createSeller();
		Seller s = new Seller(null, "ppppp", "ppppp@pppp", LocalDateTime.now(), 3000.00, new Department(1, "TTTT"));
	    List<Seller> sd = SDAO.findAll();
	    sd.stream().forEach(System.out::println);
	    System.out.println(SDAO.findById(1));
	}
}
