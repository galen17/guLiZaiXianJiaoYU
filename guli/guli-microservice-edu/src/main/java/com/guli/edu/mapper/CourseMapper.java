package com.guli.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guli.edu.entity.Course;
import com.guli.edu.vo.CoursePublishVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author Helen
 * @since 2019-06-24
 */
public interface CourseMapper extends BaseMapper<Course> {

	CoursePublishVo selectCoursePublishVoById(String id);
}
