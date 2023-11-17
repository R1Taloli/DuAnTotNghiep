package edu.poly.controller.site;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.status.Status;
import edu.poly.dao.CustomerDAO;
import edu.poly.dao.StaffDAO;
import edu.poly.model.Customer;
import edu.poly.model.Role;
import edu.poly.model.Staff;
import edu.poly.service.impl.MailerServiceImpl;
import edu.poly.utils.ParamService;
import edu.poly.utils.SessionService;
import net.bytebuddy.utility.RandomString;

@Controller
@RequestMapping("home")
public class SubmitadminController {
	@Autowired
	StaffDAO staffdao;
	
	@Autowired
	SessionService session;
	
	@Autowired
	ParamService paramService;
	
	@Autowired
	MailerServiceImpl mailer;
	
	@RequestMapping("submit-admin")
	public String sbamin(Model model) {
		List<Staff> staffs = staffdao.findAll();
//		List<Staff> listAdmin = new ArrayList<>();
//		for (Staff staff : staffs) {
//			if (staff.getRole().getName().equals("admin")) {
//				listAdmin.add(staff);	
//				System.err.println(staff.getName());
//			}
//		}
//		
		model.addAttribute("sizeList", staffs);
		return "home/submit-admin";
	}
	
	@ModelAttribute("staffadmin")
	public String getCategories() {		
		return "admin/index";
	}
////	@ModelAttribute("staff-admin")
////	public String change(Model model) {
////		String Conficode = paramService.getString("Conficode", "");
////		String role = paramService.getString("role", "");
////		String email = paramService.getString("email", "");
////		String subject = "Send your Password!";
////		String body = "Your Password: ";
////		String randomPassword = RandomString.make(6);
////		try {
////			Staff user = staffdao.findById(role).get();		
////			if (role.equals(role)) {
////				
////			}else {
////					try {
////						mailer.send(email, subject, body+randomPassword);
////					} catch (MessagingException e) {
////						// TODO Auto-generated catch block
////						model.addAttribute("message", "Send Error!");
////					}
////					model.addAttribute("message", "Please check your Email!");
////			}
////		} catch (DataAccessException e) {
////			model.addAttribute("message", "Account invalid!");
////		}
////		return "staff-admin";
//	}
}
	
	

	
//	@RequestMapping("/profile/edit/{id}")
//	public String edit(Model model, @PathVariable("id") String username) {
//		Customer item = dao.findById(username).get();
//		model.addAttribute("item", item);
//		return "home/profile";
//	}
//	
//	@RequestMapping("/profile/update")
//	public String profile(Customer item) {
//		dao.save(item);
//		return "redirect:/home/profile/edit/" + item.getUsername();
//	}

