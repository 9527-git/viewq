package com.springboot.yang.service;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.yang.dao.SysGeneratorDao;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;
import com.springboot.yang.uitls.*;
/**
 * 代码生成器
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年12月19日 下午3:33:38
 */
@Service
public class SysGeneratorService {
	@Autowired
	private SysGeneratorDao sysGeneratorDao;

	public List<Map<String, Object>> queryList(Map<String, Object> map) {
		return sysGeneratorDao.queryList(map);
	}

	public int queryTotal(Map<String, Object> map) {
		return sysGeneratorDao.queryTotal(map);
	}

	public Map<String, String> queryTable(String tableName) {
		return sysGeneratorDao.queryTable(tableName);
	}

	public List<Map<String, String>> queryColumns(String tableName) {
		return sysGeneratorDao.queryColumns(tableName);
	}


}
