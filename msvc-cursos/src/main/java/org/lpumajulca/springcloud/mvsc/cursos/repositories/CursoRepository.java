package org.lpumajulca.springcloud.mvsc.cursos.repositories;

import org.lpumajulca.springcloud.mvsc.cursos.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
