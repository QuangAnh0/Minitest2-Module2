

public class manager {
    public static void main(String[] args) {

    staff[] staffs =new staff[8];

    staffs[0]=new staffFull(1,"Vô danh 1","0988153947","quanganh1@gmail.com",2010,1500,1000);
    staffs[1]=new staffFull(2,"Vô danh 2","0988463947","quanganh2@gmail.com",2500,1700,1280);
    staffs[2]=new staffFull(3,"Vô danh 3","0986663947","quanganh3@mail.com",2240,1100,1290);
    staffs[3]=new staffFull(4,"Vô danh 4","0985163947","quanganh4@mail.com",1200,1500,1200);
    staffs[4]=new staffPart(5,"Vô danh 5","083947182","vananh1@gmai.com",10.5);
    staffs[5]=new staffPart(6,"Vô danh 6","083947582","vananh2@gmai.com",9.75);
    staffs[6]=new staffPart(7,"Vô danh 7","083945182","vananh3@gmai.com",12.25);
    staffs[7]=new staffPart(8,"Vô danh 8","083947882","vananh4@gmai.com",15);
        System.out.println("Lương thực lĩnh của NV Fulltime là: "+ salaryFull((staffFull) staffs[1]));
        System.out.println("Lương thực lĩnh của NV Parttime là: "+ salaryPart((staffPart) staffs[5]));
        System.out.println("Lương trung bình của NV là: "+ salaryAvg(staffs));
        listStaff( staffs);
        System.out.println("Số lương phải trả cho tất cả nhân viên bán thời gian là: "+ totalSalaryPart(staffs));
    sortAscendingFull(staffs);

    }
    public static void sortAscendingFull(staff[] arr) {
        staff temp = arr[0];
        System.out.println("Sắp xếp nhân viên theo số lương tăng dần :");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] instanceof staffFull && arr[j] instanceof staffFull) {
                    double salary1 = salaryFull((staffFull) arr[i]);
                    double salary2 = salaryFull((staffFull) arr[j]);
                    if (salary1 > salary2) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof staffFull) {
                System.out.println(salaryFull((staffFull)arr[i]) );
            }

        }
    }
    public static void listStaff(staff[] nameStaff){
        for (int i = 0; i < nameStaff.length ; i++) {
            if (nameStaff[i] instanceof staffFull){
                if (salaryFull((staffFull) nameStaff[i]) < salaryAvg(nameStaff)){
                    System.out.println( "Những NV Fulltine có lương thấp hơn so với lương trung bình là: " +nameStaff[i].getName());
                }
            }

        }
    }
    public static double totalSalaryPart(staff[] nameStaff){
        double sum=0;
        for (int i = 0; i < nameStaff.length ; i++) {
            if (nameStaff[i] instanceof staffPart){
                sum+=salaryPart((staffPart) nameStaff[i]);
            }
        } return sum;
    }
    public static double salaryAvg(staff[] list){
        int sum1=0;
        int sum2=0;
        int total=0;
        for (int i = 0; i <list.length ; i++) {
            if (list[i] instanceof staffFull){
             sum1+=salaryFull((staffFull)list[i]);
            }else {
                sum2+=salaryPart((staffPart) list[i]);
            }
            total=(sum1+sum2)/ list.length;
        }
        return total;
    }

    public static double salaryFull(staffFull nameFull){
        double salaryF = nameFull.getHardsalary() + (nameFull.getReward() - nameFull.getPunishcash());
        return salaryF;
    }

    public static double salaryPart(staffPart namePart){
        int money=100;
        double salaryP=namePart.getWorktime()*money;
        return salaryP;
    }
}
