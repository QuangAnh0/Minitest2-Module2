public class staffPart extends staff {
    public double worktime;

    public staffPart() {
    }

    public staffPart(int staffCode, String name, String phone, String email, double worktime) {
        super(staffCode, name, phone, email);
        this.worktime = worktime;
    }

    public double getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }
    public static double salaryPart(staffPart namePart){
        int money=100;
        double salaryP=namePart.getWorktime()*money;
        return salaryP;
    }

    @Override
    public double tinhLuong() {
        return worktime*100;
    }
}
