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
public class DemoPhoneCalls {
    public static void demo(){
        PhoneCall p1=new IncomingPhoneCall("9511234567");
        PhoneCall p2=new OutgoingPhoneCall("9517654321",7);
        System.out.println(p1.getInformation());
        System.out.println(p2.getInformation());
    }
}
