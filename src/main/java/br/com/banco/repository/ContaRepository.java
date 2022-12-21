package br.com.banco.repository;

import br.com.banco.model.Conta;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class ContaRepository implements JpaRepository<Conta, Long> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Conta> findAll() {return entityManager.createNativeQuery("SELECT * FROM conta").getResultList();
    }

    @Override
    public List<Conta> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Conta> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Conta> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Conta entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Conta> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Conta> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Conta> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Conta> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Conta> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Conta> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Conta> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Conta getOne(Long aLong) {
        return null;
    }

    @Override
    public Conta getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Conta> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Conta> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Conta> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Conta> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Conta> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Conta> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Conta, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
