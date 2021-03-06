package com.team.dto;

//oracle database table : member
public class MemberDTO {
	private String id; // col : id
	private String pwd; // col : pwd
	private String name; // col : name
	private String birth; // col : birth
	private String mail; // col : mail
	private String addr; // col : addr
	private String phone; // col : phone
	private String saltKey;
	// 생성자


	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", mail=" + mail + ", addr=" + addr + ", phone=" + phone
				+ "]";
	}
	
	public String test(){
		return "비밀번호 : " + this.getPwd() + " ,  암호키 " + this.getSaltKey();
	}

	public MemberDTO(String id, String name, String mail, String addr, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.addr = addr;
		this.phone = phone;
	}
	
	

	public MemberDTO(String id, String pwd, String name, String birth, String mail, String addr, String phone,
			String saltKey) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.mail = mail;
		this.addr = addr;
		this.phone = phone;
		this.saltKey = saltKey;
	}

	public MemberDTO(String id, String pwd, String name, String birth, String mail, String addr, String phone) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.mail = mail;
		this.addr = addr;
		this.phone = phone;
	}

	// setter , getter
	

	public String getSaltKey() {
		return saltKey;
	}

	public void setSaltKey(String saltKey) {
		this.saltKey = saltKey;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
