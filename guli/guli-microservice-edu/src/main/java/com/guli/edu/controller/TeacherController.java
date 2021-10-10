package com.guli.edu.controller;


import com.guli.common.vo.R;
import com.guli.edu.entity.Teacher;
import com.guli.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author Helen
 * @since 2019-06-24
 */
@Api(description = "讲师模块")
@CrossOrigin
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@ApiOperation(value="讲师列表")
	@GetMapping
	public R list(){
		List<Teacher> list = teacherService.list(null);
		return R.ok().data("items", list);
	}


	@ApiOperation(value="根据id查询讲师")
	@GetMapping("{teacherId}")
	public R getById(
			@ApiParam(name = "teacherId", value = "讲师ID", required = true)
			@PathVariable String teacherId){

		Teacher teacher = teacherService.getById(teacherId);
		return R.ok().data("teacher", teacher);
	}


}

