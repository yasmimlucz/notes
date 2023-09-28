package com.controle.notebooks.Repository;

import com.controle.notebooks.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {

    @Query(value="SELECT * FROM usuario WHARE matricula = :matricula and senha= :senha and " , nativeQuery = true)
    M_Usuario buscarPorMatriculaSenha /*nome da função*/ (@Param("matricula")Long matricula,
                        @Param("senha") String senha);
}
