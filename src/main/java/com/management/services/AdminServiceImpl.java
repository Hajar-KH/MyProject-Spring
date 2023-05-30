package com.management.services;

import com.management.entities.Admin;
import com.management.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;
    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
    @Override
    public Admin getAdminById(Long id){
        return adminRepository.findById(id).get();
    }

    @Override
    public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }

}
