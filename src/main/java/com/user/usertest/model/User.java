package com.user.usertest.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
	@GeneratedValue
	private Long id;
	private String name;

    public User () {
	}
	
	public User(Long id, String name){
		this.id = id;
		this.name = name;
	}
}
