package main.java.com.user.usertest.dto;

import main.java.com.user.usertest.model.User;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;
	private String name;

    public UserDTO(){}

    public UserDTO(Long id, String name){
		this.id = id;
		this.name = name;
	}

	public static UserDTO toDTO(User obj) {
        UserDTO dto = new UserDTO();
        dto.setId(obj.getId());
        dto.setName(obj.getName());
        return dto;
    }

    public static User toEntity(User dto) {
        User obj = new User();
        obj.setId(dto.getId());
        obj.setName(dto.getName());
        return obj;
    }
    
}