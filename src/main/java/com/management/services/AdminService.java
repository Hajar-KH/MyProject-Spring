package com.management.services;

import com.management.entities.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    Admin saveAdmin(Admin admin);
    Admin updateAdmin(Admin admin);


    Admin getAdminById(Long id);
    List<Admin> getAdmins();
}
