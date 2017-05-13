package com.yin.jiajiao.service.impl;

import com.yin.jiajiao.dao.inter.ITestDaoInteface;
import com.yin.jiajiao.entities.User;
import com.yin.jiajiao.service.inter.ITestServiceInterface;

/**
 * @Describe: 测试实现
 * @ClassName: com.yin.jiajiao.service.impl.TestServiceImpl
 * @WriterName: QQ
 * @CreateDate: 2017年5月10日 下午5:14:38
 * @Company: 北京龍兴科技股份有限公司
 * @CopyRight: Copyright © 2017
 * @version 1.0
 */
public class TestServiceImpl implements ITestServiceInterface {

	private ITestDaoInteface testDao;
	
	public void setTestDao(ITestDaoInteface testDao) {
		this.testDao = testDao;
	}

	public User login(User user) {
		return testDao.login(user);
	}

}
