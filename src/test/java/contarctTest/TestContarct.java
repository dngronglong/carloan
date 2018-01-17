package contarctTest;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.loan.beans.PagerBean;
import org.project.loan.companymag.service.ICompanyService;
import org.project.loan.contractmag.repository.ContractRepository;
import org.project.loan.contractmag.service.IContractReadService;
import org.project.loan.contractmag.service.IContractWriteService;
import org.project.loan.customermag.dao.impl.CustomerDaoImpl;
import org.project.loan.rolemag.service.IRoleService;
import org.project.loan.usermag.service.IUserReadService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestContarct {

	@Resource
	private IContractReadService contractReadServiceImpl;
	
	@Resource
	private IUserReadService userReadServiceImpl;
	
	@Resource
	private CustomerDaoImpl customerDaoImpl;
	
	@Resource
	private  ICompanyService companyServiceImpl;
	
	@Resource
	private IRoleService roleServiceImpl;
	
	@Resource
	private IContractWriteService contractWriteServiceImpl;
	
	@Test
	public void find() {
		Map params = new HashMap<>();
		params.put("contractNumber", 10001);
		params.put("contractStatus", 1);
		PagerBean pager = new PagerBean(1, 5, params);
		System.out.println(contractReadServiceImpl.findContractByPage(pager));
		
	}
	
	@Test
	public void findCon() {
		
		System.out.println(roleServiceImpl.findRoleAll());
	}
	
	@Test
	public void finduser() {
		Map params = new HashMap<>();
		params.put("userName", "abc");
		PagerBean pager = new PagerBean(1, 5, params);
		System.out.println(userReadServiceImpl.findUserByPage(pager));
		
	}
	
	@Test
	public void upadateStatus() {
		contractWriteServiceImpl.updateContractStatus(5, 1);
	}
}
