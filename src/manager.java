import java.util.ArrayList;

public class manager {
   static ArrayList<staff> staffs = new ArrayList<>();

    public static void main(String[] args) {
        staffFull staffs1 = new staffFull(1, "Vô danh 1", "0988153947", "quanganh1@gmail.com", 2010, 1500, 1000);
        staffFull staffs2 = new staffFull(2, "Vô danh 2", "0988463947", "quanganh2@gmail.com", 2500, 1700, 1280);
        staffFull staffs3 = new staffFull(3, "Vô danh 3", "0986663947", "quanganh3@mail.com", 2240, 1100, 1290);
        staffFull staffs4 = new staffFull(4, "Vô danh 4", "0985163947", "quanganh4@mail.com", 1200, 1500, 1200);
        staffPart staffs5 = new staffPart(5, "Vô danh 5", "083947182", "vananh1@gmai.com", 30.5);
        staffPart staffs6 = new staffPart(6, "Vô danh 6", "083947582", "vananh2@gmai.com", 39.75);
        staffPart staffs7 = new staffPart(7, "Vô danh 7", "083945182", "vananh3@gmai.com", 12.25);
        staffPart staffs8 = new staffPart(8, "Vô danh 8", "083947882", "vananh4@gmai.com", 5);


        staffs.add(staffs1);
        staffs.add(staffs2);
        staffs.add(staffs3);
        staffs.add(staffs4);
        staffs.add(staffs5);
        staffs.add(staffs6);
        staffs.add(staffs7);
        staffs.add(staffs8);


        System.out.println("Lương Tb là: "+ getsalaryAvg());
        System.out.println("Nhân viên lương dưới lương TB"+ listUnderavg());
        System.out.println("Lương tổng parttime"+ sumSalaryPart());
        System.out.println("Danh sách lương tăng dần"+luongFulltang(staffs));
    }
    // Tính lương trung bình
    public static double getsalaryAvg(){
        double sum1 = 0;
        for (staff e: staffs) {
            sum1 += e.tinhLuong();
        }
        double average = sum1/staffs.size();
        return average;
    }
    public static ArrayList<staff> listUnderavg(){
        double avg=getsalaryAvg();
        ArrayList<staff>listunder=new ArrayList<>();
        for (int i = 0; i <staffs.size() ; i++) {
            if (staffs.get(i) instanceof staffPart && staffs.get(i).tinhLuong()<avg ){
                listunder.add(staffs.get(i));
            }
        }return listunder;

}

   //lương partime
    public static double sumSalaryPart(){
        int sum2 = 0;
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i) instanceof staffPart) {
                sum2 += staffs.get(i).tinhLuong();
            }
        } return sum2;
    }
    //tổng lương fulltime

    public static ArrayList<staff> luongFulltang(ArrayList<staff> arr) {
//        ArrayList<Employee> array = new ArrayList<>();
        staff team = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j=i+1; j<arr.size(); j++) {
                if (arr.get(i) instanceof staffFull &&
                        arr.get(j) instanceof staffFull) {
                    if (arr.get(i).tinhLuong()>arr.get(j).tinhLuong()) {
                        team = arr.get(j);
                    }
                }
            }
        } return arr;
    }
}