package com.springRest.service;

import com.springRest.DAO.ContactRepository;
import com.springRest.enitity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService
{
    @Autowired
    private ContactRepository contactRepository;

    //contact  message throw any details send user to admin
    public ContactService(ContactRepository contactRepository)
    {
        this.contactRepository = contactRepository;
    }
    public void save(Contact contact)
    {
        contactRepository.save(contact);
    }

}
