package com.korealm.simbache.repositories;

import com.korealm.simbache.models.SessionToken;
import com.korealm.simbache.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionTokenRepository extends JpaRepository<SessionToken, String> {

    // Busca el token en la base de datos para validar la sesión del usuario
    Optional<SessionToken> findByTokenId(String tokenId);

    // Encontrar el token asociado al usuario, o encontrar token por usuario, pues.
    Optional<SessionToken> findByUser(User user);

    // Borrar un token (logout)
    void deleteByTokenId(String tokenId);

    void deleteByUser(User user);
}
