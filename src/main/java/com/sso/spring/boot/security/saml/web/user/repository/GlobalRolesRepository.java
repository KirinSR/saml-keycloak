package com.sso.spring.boot.security.saml.web.user.repository;

import com.sso.spring.boot.security.saml.web.user.document.GlobalRoles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GlobalRolesRepository  extends MongoRepository<GlobalRoles,String> {
}
