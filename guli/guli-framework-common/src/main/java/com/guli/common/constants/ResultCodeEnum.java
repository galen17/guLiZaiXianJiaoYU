package com.guli.common.constants;

import lombok.Getter;

/**
 * @author helen
 * @since 2019/6/24
 */
@Getter
public enum ResultCodeEnum {

	SUCCESS(true, 20000,"成功"),
	UNKNOWN_REASON(false, 20001, "未知错误"),
	BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),
	JSON_PARSE_ERROR(false, 21002, "json解析异常"),
	PARAM_ERROR(false, 21003, "参数不正确"),
	FILE_UPLOAD_ERROR(false, 21004, "文件上传错误"),
	EXCEL_DATA_IMPORT_ERROR(false, 21005, "Excel数据导入错误"),

	VIDEO_UPLOAD_ERROR(false, 22001, "阿里云视频上传错误"),
	VIDEO_DELETE_ALIYUN_ERROR(false, 22002, "阿里云视频删除错误"),
	FETCH_VIDEO_PLAYAUTH_ERROR(false, 22003, "阿里云获取上传凭证错误"),
	REFRESH_VIDEO_PLAYAUTH_ERROR(false, 22004, "阿里云刷新传凭证错误");


	private Boolean success;//响应是否成功
	private Integer code;//返回码
	private String message;//返回消息

	ResultCodeEnum(Boolean success, Integer code, String message) {
		this.success = success;
		this.code = code;
		this.message = message;
	}
}
