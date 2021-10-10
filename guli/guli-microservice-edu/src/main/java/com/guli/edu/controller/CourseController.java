package com.guli.edu.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guli.common.vo.R;
import com.guli.edu.entity.Course;
import com.guli.edu.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 课程 前端控制器
 * </p>
 *
 * @author Helen
 * @since 2019-06-24
 */
@CrossOrigin
@Api(description = "课程模块")
@RestController
@RequestMapping("/edu/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@ApiOperation(value = "分页课程列表")
	@GetMapping("{page}/{limit}")
	public R pageList(
			@ApiParam(name = "page", value = "当前页码", required = true)
			@PathVariable Long page,

			@ApiParam(name = "limit", value = "每页记录数", required = true)
			@PathVariable Long limit
	){

		Page<Course> coursePage = new Page<>(page, limit);
		Map<String , Object> map = courseService.pageListWeb(coursePage);

		return R.ok().data(map);
	}

}

