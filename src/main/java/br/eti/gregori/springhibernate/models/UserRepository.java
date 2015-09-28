/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.gregori.springhibernate.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rodrigo
 */
public interface UserRepository extends CrudRepository<User, Long> {
    /**
     * Este método buscará uma instância de usuário na base através do seu email.
     * Observe que este método não é implementado e seu código será gerado
     * "automagicamente" a partir da sua assinatura, pelo Spring Data JPA
     * @param email
     * @return User
     */
    public User findByEmail(@Param("email") String email);
}
