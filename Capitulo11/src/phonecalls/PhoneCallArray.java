/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecalls;

/**
 *
 * @author omarcr
 */
public class PhoneCallArray {
    public static void useIt(){
        PhoneCall[] arrayOfPhoneCalls=new PhoneCall[10];
        arrayOfPhoneCalls[0]=new IncomingPhoneCall("9511234567");
        arrayOfPhoneCalls[1]=new OutgoingPhoneCall("9516734355",10);
        arrayOfPhoneCalls[2]=new IncomingPhoneCall("9511112233");
        arrayOfPhoneCalls[3]=new OutgoingPhoneCall("9583332277",3);
        arrayOfPhoneCalls[4]=new IncomingPhoneCall("9711238899");
        arrayOfPhoneCalls[5]=new IncomingPhoneCall("9514561122");
        arrayOfPhoneCalls[6]=new OutgoingPhoneCall("2229876543",12);
        arrayOfPhoneCalls[7]=new IncomingPhoneCall("2221782233");
        arrayOfPhoneCalls[8]=new IncomingPhoneCall("9510005566");
        arrayOfPhoneCalls[9]=new OutgoingPhoneCall("9513333333",1);
        for(int i=0;i<10;i++){
            System.out.println(arrayOfPhoneCalls[i].getInformation());
        }
    }
}
