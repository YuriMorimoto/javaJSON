package com.example.image;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

	@Autowired
	AccuntRepository repository;


	@RequestMapping("index")
	public String top() {
		return "index";
	}

	// read
	@GetMapping("data")
	@Transactional
	@ResponseBody
	public List<AccountEntity> users(){
		List<AccountEntity> users = repository.findAll();
		return users;
	}

	// create
	@PostMapping(value="insert")
	public void insert(@RequestBody AccountEntity accountEntity) {
		repository.save(accountEntity);
	}

	// upload
	@GetMapping("update")
	@ResponseBody
	public Optional<AccountEntity> getAccount(@RequestParam String id){
		return repository.findById(Integer.parseInt(id));
	}

	@PutMapping("update")
	public void update(@RequestBody AccountEntity accountEntity){
		repository.save(accountEntity);
	}

	// delete
	@DeleteMapping("delete")
	public void delete(@RequestParam String id){
		repository.deleteById(Integer.parseInt(id));
	}


}
