interface Staff{
    int getSalary();
    boolean isStanding();
}
interface Passenger{
}
public class GenericsDemo3 {
        //工资低于2500元的上斑族并且站立的乘客车票打8折
        public static <T extends Staff & Passenger> void discount(T t){
            if(t.getSalary()<2500 && t.isStanding()){
                System.out.println("恭喜你！您的车票打八折！");
            }
        }
        public static void main(String[] args) {
            discount(new Me());
        }
        public static class Me implements Staff,Passenger {
            @Override
            public int getSalary(){
                return 1;
            }
            @Override
            public boolean isStanding() {
                return false;
            }
        }
}
