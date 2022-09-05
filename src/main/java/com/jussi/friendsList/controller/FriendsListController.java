package com.jussi.friendsList.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jussi.friendsList.domain.Friend;

@Controller
public class FriendsListController {
	
	private ArrayList<Friend> frendos = new ArrayList<Friend>();
	
	@GetMapping(value = "/index")
	public String printFriends(Model model) {
		
		model.addAttribute("friendsList", ystavaLista());
		
		return "index";
	}
	
	@PostMapping("/index")
	public String addFriend(Friend frendo) {
		frendos.add(frendo);
		
		return "redirect:/index";
	}
	
	private ArrayList<Friend> ystavaLista() {
		ArrayList<Friend> lista = new ArrayList<Friend>();
		lista.add(new Friend("Jane", "Porter"));
		lista.add(new Friend("Me", "Tarzan"));
		lista.add(new Friend("Cheeta", "TheChimp"));
		return lista;
		
	}
	
	

}
