/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author delores
 */
public interface Securable {
    public void armSystem();
    public void disarmSystem(int passcode);
    public void triggerAlarm();
    public void cancelAlarm(int passocde);
    
}
