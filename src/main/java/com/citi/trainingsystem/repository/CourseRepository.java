package com.citi.trainingsystem.repository;

import com.citi.trainingsystem.entity.Course;
import com.citi.trainingsystem.entity.union.CourseEditHistoryList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, String> {
    Optional<Course> findByName(String name);

    List<Course> findByIdIn(List<String> courseIdList);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "DELETE FROM course WHERE id in (?1)")
    void deleteByIdInList(List<String> courseIdList);

    @Query(nativeQuery = true, value = "SELECT currentCourse.name as currentName, history.name as historyName FROM course currentCourse, course_history history WHERE currentCourse.id = history.course_id")
    List<CourseEditHistoryList> findCourseEditHistoryList(String courseId);
}
