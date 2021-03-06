/**
 * 
 */
package com.bcj.webinventory.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.DroolsParserException;

import org.drools.core.WorkingMemory;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import com.bcj.webinventory.dao.InventoryDao;
import com.bcj.webinventory.model.Order;

/**
 * @author 
 *
 */
public class InventoryService {

	public void saveOrder(String productName) {
		System.out.println("Service: " + productName);
		Order order = new Order();
		order.setProductName(productName);
		InventoryService irs = new InventoryService();
		try {
			irs.executeDrools(order);
		} catch (DroolsParserException | IOException e) {
			e.printStackTrace();
		}
	}

	public void executeDrools(Order order) throws DroolsParserException, IOException {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/com/rule/Rules.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		workingMemory.insert(order);
		workingMemory.fireAllRules();
		
		InventoryDao invDAO= new InventoryDao();
		invDAO.saveOrder(order);

		System.out.println(order.toString());
	}
}
