package com.example.Quiz_Project.service.user;

public interface UserService {
  
   User createUser(User user);

    Boolean hasUserWithEmail(String email);
}
