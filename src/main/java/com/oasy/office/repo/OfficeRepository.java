package com.oasy.office.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.oasy.office.entity.OfficeEntity;

public interface OfficeRepository extends JpaRepositoryImplementation<OfficeEntity, Integer> {

}
