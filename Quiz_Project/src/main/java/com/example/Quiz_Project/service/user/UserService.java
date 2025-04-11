package com.example.Quiz_Project.service.user;

public interface UserService {
  
   User createUser(User user); //Create user

   Boolean hasUserWithEmail(String email); //Admin

    User login(User user); // Login Api
}
