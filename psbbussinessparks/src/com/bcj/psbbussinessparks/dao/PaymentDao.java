package com.bcj.psbbussinessparks.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bcj.psbbussinessparks.modal.Payment;

/**
 * @author Bootcamp User 005 this class is used to load the payment details from
 *         an external file by reading the file using buffered reader and verify
 *         the details
 */
public class PaymentDao {
	boolean flag;

	String line;

	/**
	 * @param pymnt
	 * @return
	 * @throws IOException
	 *             this method returns true if the details entered by user are
	 *             verified succesfully by loading the details from the external
	 *             file other wise returns false
	 */
	public boolean verifyPayment(Payment pymnt) throws IOException {
		// TODO Auto-generated method stub

		/**
		 * reads the file from the given path using bufferred reader and file
		 * reader objects
		 */
		BufferedReader br = new BufferedReader(new FileReader(System.getenv("CATALINA_HOME")+"\\webapps\\resources\\payment.txt"));
				//"C:\\BCJ_DEC_2016\\Development_Tools\\apache-tomcat-8.5.11\\webapps\\resources\\payment.txt"));
		if (br != null) {
			//C:\BCJ_DEC_2016\Development_Tools\apache-tomcat-8.5.11\webapps\resources

			/**
			 * reads line by line
			 */
			while ((line = br.readLine()) != null) {
				String[] lineArry = line.split(" ");
				if (lineArry[0].equals(pymnt.getNameOnCard()) && (lineArry[1].equals(pymnt.getCardNumber()))
						&& (lineArry[2].equals(pymnt.getCvv()))
						&& (Integer.parseInt(lineArry[3]) >= Integer.parseInt(pymnt.getAmount()))) {
					flag = true;
					break;
				}

				else
					flag = false;

			}
			br.close();
		}
		return flag;
	}

}
