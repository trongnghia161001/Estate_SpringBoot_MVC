package com.laptrinhjavaweb.repository.custom;

import com.laptrinhjavaweb.entity.UserEntity;

import java.util.List;

public interface UserRepositoryCustom {
     List<UserEntity> findByAssignmentBuilding_building(Long buildingId);
}