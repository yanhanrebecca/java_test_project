package set;
import java.util.*;

public class AccountCustomer {
    public static void main(String [] args){
        HashMap<String, HashSet<String>> ac = new HashMap<String, HashSet<String>>();
        HashSet<String> cus1 = new HashSet<String>();
        cus1.add("SY15");
        cus1.add("SY05");
        ac.put("211302123313123", cus1);
        HashSet<String> cus2 = new HashSet<String>();
        cus2.add("DL15");
        cus2.add("DL05");
        ac.put("211212333029423", cus2);
        HashSet<String> cus3 = new HashSet<String>();
        cus3.add("SH15");
        cus3.add("SH05");
        ac.put("211212fewfew23", cus2);
        Iterator<String> it = ac.keySet().iterator();
        while(it.hasNext()){
            //String customer = (String) it.next();
            String customer = it.next();
            //HashSet<String> account = (HashSet<String>) ac.get(customer);
            HashSet<String> account = ac.get(customer);
            Object[] acc = account.toArray();
            System.out.println("身份证号码是" + customer + "的用户的账户是");
            for(int i = 0; i < acc.length; i++){
                System.out.println(acc[i] + " ");
            }
            System.out.println();
        }



    }
}
