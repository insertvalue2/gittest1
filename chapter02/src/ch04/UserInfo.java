package ch04;

public class UserInfo {
	
	String userId; 
	String userPassword; 
	String userName; 
	String userAddress; 
	String phoneNumber;
	
	// alt + shift + s, o 
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	public UserInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
//	
//	// ������ �����ε� 
//	// �߿�! �����ڴ� ��ü�� ������ �� ó�� ����Ǵ� 
//	// �ڵ� �Դϴ�. 
//	
//	// 1. �⺻ �����ڸ� ����� �ּ���. 
//	public UserInfo() {}
//
//	// 2. userId �� �޴� �����ڸ� ����� �ּ���. 
//	public UserInfo(String userId) {
//		this.userId = userId;
//	}
//
//	// 3. userId, userPassword �� �޴� �����ڸ� ����� �ּ���. 
//	public UserInfo(String userId, String userPassword) {
//		this.userId = userId;
//		this.userPassword = userPassword;
//	}
//
//	// 4. userId, userPassword, userName �� �޴� �����ڸ� ����� �ּ���.
//	public UserInfo(String userId, String userPassword,String userName) {
//		this.userId = userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//	}
//
//	// 5. userId, userPassword, userName, userAddress 
//	public UserInfo(String userId, String userPassword,String userName, String userAddress) {
//		this.userId = userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//		this.userAddress = userAddress;
//	}
//
//	// 6. userId, userPassword, userName, userAddress, phoneNumber
//	public UserInfo(String userId, String userPassword,String userName, String userAddress, String phoneNumber) {
//		this.userId = userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		this.phoneNumber = phoneNumber;
//	}

}
