package com.citi.trainingsystem.repository;

import com.citi.trainingsystem.entity.CourseHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseHistoryRepository extends CrudRepository<CourseHistory, String> {

    List<CourseHistory> findByCourseId(String courseId);

//    @Query("select * from courseHistory where courseHistory.courseId = ?1")
//    List<CourseHistory> findHistoryByCourseId(String courseId);
}
