public abstract class staff {
    private int staffCode;
    private String name;
    private String phone;
    private String email;

    public staff(int staffCode, String name, String phone, String email) {
        this.staffCode = staffCode;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public abstract double tinhLuong();
    public staff() {
    }

    @Override
    public String toString() {
        return "staff{" +
                "staffCode=" + staffCode +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(int staffCode) {
        this.staffCode = staffCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
