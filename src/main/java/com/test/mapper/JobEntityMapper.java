package com.test.mapper;

import com.test.pojo.JobEntity;

import java.util.List;

public interface JobEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(JobEntity record);

    JobEntity selectByPrimaryKey(Long id);

    List<JobEntity> selectAll();

    int updateByPrimaryKey(JobEntity record);
}