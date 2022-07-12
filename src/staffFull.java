public class staffFull extends staff{
   public double reward;
    public double punishcash;
    public double hardsalary;

    public staffFull() {
    }

    public staffFull(int staffCode, String name, String phone, String email, double reward, double punishcash, double hardsalary) {
        super(staffCode, name, phone, email);
        this.reward = reward;
        this.punishcash = punishcash;
        this.hardsalary = hardsalary;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getPunishcash() {
        return punishcash;
    }

    public void setPunishcash(double punishcash) {
        this.punishcash = punishcash;
    }

    public double getHardsalary() {
        return hardsalary;
    }

    public void setHardsalary(double hardsalary) {
        this.hardsalary = hardsalary;
    }
    public static double salaryFull(staffFull nameFull){
        double salaryF= nameFull.getHardsalary() + (nameFull.getReward() - nameFull.getPunishcash());
        return salaryF;
    }
}
