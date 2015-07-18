/**
 * 
 */
package gles.util;

import java.awt.event.*;
import java.awt.event.KeyEvent;

import android.view.*;

/**
 * This class maps key codes from Java AWT to
 * Android OS.<br>
 *  KeyEvent
 * 
 * 
 * @author Alessandro Borges
 *
 */
public class KeyCodeMap {

    java.awt.event.KeyEvent awtKeyEvent ; 
    android.view.KeyEvent androidKeyEvent ; 
    
    public static int mapAWTKeyEvent2Android(int awtKeyCode){
        switch (awtKeyCode) {
            case KeyEvent.VK_0  :  return  android.view.KeyEvent.KEYCODE_0;
            case KeyEvent.VK_1  :  return  android.view.KeyEvent.KEYCODE_1;
            case KeyEvent.VK_2  :  return  android.view.KeyEvent.KEYCODE_2;
            case KeyEvent.VK_3  :  return  android.view.KeyEvent.KEYCODE_3;
            case KeyEvent.VK_4  :  return  android.view.KeyEvent.KEYCODE_4;
            case KeyEvent.VK_5  :  return  android.view.KeyEvent.KEYCODE_5;
            case KeyEvent.VK_6  :  return  android.view.KeyEvent.KEYCODE_6;
            case KeyEvent.VK_7  :  return  android.view.KeyEvent.KEYCODE_7;
            case KeyEvent.VK_8  :  return  android.view.KeyEvent.KEYCODE_8;
            case KeyEvent.VK_9  :  return  android.view.KeyEvent.KEYCODE_9;
            case KeyEvent.VK_A  :  return  android.view.KeyEvent.KEYCODE_A;
            case KeyEvent.VK_AT  :  return  android.view.KeyEvent.KEYCODE_AT;
            case KeyEvent.VK_B  :  return  android.view.KeyEvent.KEYCODE_B;
            case KeyEvent.VK_C  :  return  android.view.KeyEvent.KEYCODE_C;
            case KeyEvent.VK_CAPS_LOCK  :  return  android.view.KeyEvent.KEYCODE_CAPS_LOCK;
            case KeyEvent.VK_CLEAR  :  return  android.view.KeyEvent.KEYCODE_CLEAR;
            case KeyEvent.VK_COMMA  :  return  android.view.KeyEvent.KEYCODE_COMMA;
            case KeyEvent.VK_D  :  return  android.view.KeyEvent.KEYCODE_D;
            case KeyEvent.VK_E  :  return  android.view.KeyEvent.KEYCODE_E;
            case KeyEvent.VK_ENTER  :  return  android.view.KeyEvent.KEYCODE_ENTER;
            case KeyEvent.VK_EQUALS  :  return  android.view.KeyEvent.KEYCODE_EQUALS;
            case KeyEvent.VK_ESCAPE  :  return  android.view.KeyEvent.KEYCODE_ESCAPE;
            case KeyEvent.VK_F  :  return  android.view.KeyEvent.KEYCODE_F;
            case KeyEvent.VK_F1  :  return  android.view.KeyEvent.KEYCODE_F1;
            case KeyEvent.VK_F10  :  return  android.view.KeyEvent.KEYCODE_F10;
            case KeyEvent.VK_F11  :  return  android.view.KeyEvent.KEYCODE_F11;
            case KeyEvent.VK_F12  :  return  android.view.KeyEvent.KEYCODE_F12;
            case KeyEvent.VK_F2  :  return  android.view.KeyEvent.KEYCODE_F2;
            case KeyEvent.VK_F3  :  return  android.view.KeyEvent.KEYCODE_F3;
            case KeyEvent.VK_F4  :  return  android.view.KeyEvent.KEYCODE_F4;
            case KeyEvent.VK_F5  :  return  android.view.KeyEvent.KEYCODE_F5;
            case KeyEvent.VK_F6  :  return  android.view.KeyEvent.KEYCODE_F6;
            case KeyEvent.VK_F7  :  return  android.view.KeyEvent.KEYCODE_F7;
            case KeyEvent.VK_F8  :  return  android.view.KeyEvent.KEYCODE_F8;
            case KeyEvent.VK_F9  :  return  android.view.KeyEvent.KEYCODE_F9;
            case KeyEvent.VK_G  :  return  android.view.KeyEvent.KEYCODE_G;
            case KeyEvent.VK_H  :  return  android.view.KeyEvent.KEYCODE_H;
            case KeyEvent.VK_HELP  :  return  android.view.KeyEvent.KEYCODE_HELP;
            case KeyEvent.VK_HOME  :  return  android.view.KeyEvent.KEYCODE_HOME;
            case KeyEvent.VK_I  :  return  android.view.KeyEvent.KEYCODE_I;
            case KeyEvent.VK_INSERT  :  return  android.view.KeyEvent.KEYCODE_INSERT;
            case KeyEvent.VK_J  :  return  android.view.KeyEvent.KEYCODE_J;
            case KeyEvent.VK_K  :  return  android.view.KeyEvent.KEYCODE_K;
            case KeyEvent.VK_KANA  :  return  android.view.KeyEvent.KEYCODE_KANA;
            case KeyEvent.VK_L  :  return  android.view.KeyEvent.KEYCODE_L;
            case KeyEvent.VK_M  :  return  android.view.KeyEvent.KEYCODE_M;
            case KeyEvent.VK_MINUS  :  return  android.view.KeyEvent.KEYCODE_MINUS;
            case KeyEvent.VK_N  :  return  android.view.KeyEvent.KEYCODE_N;
            case KeyEvent.VK_NUM_LOCK  :  return  android.view.KeyEvent.KEYCODE_NUM_LOCK;
            case KeyEvent.VK_O  :  return  android.view.KeyEvent.KEYCODE_O;
            case KeyEvent.VK_P  :  return  android.view.KeyEvent.KEYCODE_P;
            case KeyEvent.VK_PAGE_DOWN  :  return  android.view.KeyEvent.KEYCODE_PAGE_DOWN;
            case KeyEvent.VK_PAGE_UP  :  return  android.view.KeyEvent.KEYCODE_PAGE_UP;
            case KeyEvent.VK_PERIOD  :  return  android.view.KeyEvent.KEYCODE_PERIOD;
            case KeyEvent.VK_PLUS  :  return  android.view.KeyEvent.KEYCODE_PLUS;
            case KeyEvent.VK_Q  :  return  android.view.KeyEvent.KEYCODE_Q;
            case KeyEvent.VK_R  :  return  android.view.KeyEvent.KEYCODE_R;
            case KeyEvent.VK_S  :  return  android.view.KeyEvent.KEYCODE_S;
            case KeyEvent.VK_SCROLL_LOCK  :  return  android.view.KeyEvent.KEYCODE_SCROLL_LOCK;
            case KeyEvent.VK_SEMICOLON  :  return  android.view.KeyEvent.KEYCODE_SEMICOLON;
            case KeyEvent.VK_SLASH  :  return  android.view.KeyEvent.KEYCODE_SLASH;
            case KeyEvent.VK_SPACE  :  return  android.view.KeyEvent.KEYCODE_SPACE;
            case KeyEvent.VK_T  :  return  android.view.KeyEvent.KEYCODE_T;
            case KeyEvent.VK_TAB  :  return  android.view.KeyEvent.KEYCODE_TAB;
            case KeyEvent.VK_U  :  return  android.view.KeyEvent.KEYCODE_U;
            case KeyEvent.VK_V  :  return  android.view.KeyEvent.KEYCODE_V;
            case KeyEvent.VK_W  :  return  android.view.KeyEvent.KEYCODE_W;
            case KeyEvent.VK_X  :  return  android.view.KeyEvent.KEYCODE_X;
            case KeyEvent.VK_Y  :  return  android.view.KeyEvent.KEYCODE_Y;
            case KeyEvent.VK_Z  :  return  android.view.KeyEvent.KEYCODE_Z;


            default:
                return 0;
               
        }
    }
    
}
