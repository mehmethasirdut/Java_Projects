package ExerciseProgram;

public class idman {
    private int burpee_number;
    private int pushup_number;
    private int situp_number;
    private int squat_number;

    public idman(int burpee_number, int pushup_number, int situp_number, int squat_number) {
        setBurpee_number(burpee_number);
        setPushup_number(pushup_number);
        setSitup_number(situp_number);
        setSquat_number(squat_number);

    }

    public int getBurpee_number() {
        return burpee_number;
    }

    public void setBurpee_number(int burphy_number) {
        this.burpee_number = burphy_number;
    }

    public int getPushup_number() {
        return pushup_number;
    }

    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }

    public int getSitup_number() {
        return situp_number;
    }

    public void setSitup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    public int getSquat_number() {
        return squat_number;
    }

    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }
    public void makeAmove(String typeOfMovement, int number) {

        if (typeOfMovement.equals("Burpee")) {
            moveBurpee(number);
        } else if (typeOfMovement.equals("Pushup")) {
            movePushup(number);
        } else if (typeOfMovement.equals("Situp")) {
            moveSitup(number);
        } else if (typeOfMovement.equals("Squat")){
            moveSquat(number);
        }
        else System.out.println("wrong move...");
    }

    public void moveBurpee(int number){
        if (burpee_number==0)
            System.out.println("no more burpees to do");
        if (burpee_number-number<0) {
            System.out.println("you've exceeded your target number of burpees. Congratulations!");
            burpee_number=0;
            System.out.println("number of remaining burpees "+burpee_number);
        }else {
            burpee_number-=number;
            System.out.println("number of remaining burpees "+burpee_number);
        }
    }
    public void movePushup(int number){
        if (pushup_number==0)
            System.out.println("no more pushup to do");
        if (pushup_number-number<0) {
            System.out.println("you've exceeded your target number of pushup. Congratulations!");
            pushup_number=0;
            System.out.println("number of remaining pushup "+pushup_number);
        }else {
            pushup_number-=number;
            System.out.println("number of remaining pushup "+pushup_number);
        }
    }

    public void moveSitup(int number){
        if (situp_number==0)
            System.out.println("no more situp to do");
        if (situp_number-number<0) {
            System.out.println("you've exceeded your target number of situp. Congratulations!");
            situp_number=0;
            System.out.println("number of remaining situp "+situp_number);
        }else {
            situp_number-=number;
            System.out.println("number of remaining situp "+situp_number);
        }
    }

    public void moveSquat(int number){
        if (squat_number==0)
            System.out.println("no more squat to do");
        if (squat_number-number<0) {
            System.out.println("you've exceeded your target number of squat. Congratulations!");
            squat_number=0;
            System.out.println("number of remaining squat "+squat_number);
        }else {
            squat_number-=number;
            System.out.println("number of remaining squat "+squat_number);
        }
    }

    public boolean idmanFinish(){
        return (burpee_number==0)&&(pushup_number==0)
                &&(situp_number==0)&&(squat_number==0);
    }

}
