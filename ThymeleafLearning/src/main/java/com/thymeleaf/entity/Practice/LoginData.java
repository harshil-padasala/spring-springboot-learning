package com.thymeleaf.entity.Practice;

import jakarta.validation.constraints.*;

public class LoginData {

    @NotBlank(message = "User name can not be empty !!")
    @Size(min = 3, max = 10, message = "Username must be between 3 - 12 characters !!")
    private String username;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Invalid email !!!")
//    @Email(regexp = "^[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}", message = "Invalid email !!!")
    private String email;

    @AssertTrue(message = "Please accept terms and conditions !!!")
    private boolean agreed;

    public LoginData() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
