package com.simple.sample.repository;

import com.simple.sample.domain.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lingjun.jlj
 * @date: 2019/9/19 22:18
 * @description:
 */
public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
