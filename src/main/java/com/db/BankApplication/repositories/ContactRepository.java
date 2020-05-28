package com.db.BankApplication.repositories;

import com.db.BankApplication.models.Contact;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


public interface ContactRepository extends CouchbaseRepository<Contact, String> {
    @Override
    void delete(Contact deleted);
}

