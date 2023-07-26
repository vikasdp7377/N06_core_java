//progrsm to demontrate on encapsulation
/* encapsulation achives data hidding using private acces
 * specifier
 */
package org.tnsif.encapsulation;

public class HDfc {
	private String accType;
	private long accountNo;
	private long atmCardNo;
	private int pinno;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	@Override
	public String toString() {
		return "HDfc [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinno=" + pinno
				+ "]";
	}
	
}
