package com.netease.cloud.demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.netease.cloud.demo.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}