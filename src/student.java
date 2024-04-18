public class student {
    static int[] minAttendance = new int[] {44,42,40,47};

    static String StudentSuccess(double grade){
        if (grade > 3.5){
            String result="Success";
            return result;
        }
        else{
            String result = "failed";
            return result;
        }
    }

    static boolean excuseAccepttance(String excuse){
        if((excuse.contains("hospital")) || (excuse.contains("Hospital"))){
            return true;
        }
        else return false;
    }

    static int[] increaseAbsence(int array[]){
        for (int i=0 ; i<4 ; i++){
            array[i]=array[i]+1;
        }
        return array;
    }

    static boolean isThereAbsence(int array[]){
        for (int i=0 ; i<4 ; i++){
            if (array[i] < minAttendance[i]){
                return true;
            }
        }
        return false;
    }
}
