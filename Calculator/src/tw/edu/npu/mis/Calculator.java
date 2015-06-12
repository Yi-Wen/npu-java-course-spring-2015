/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;
import static org.omg.CORBA.ORB.init;

/**
 * The model class of the calculator application.
 */
public class Calculator extends java.util.Observable{
    double x,y;
    String num = "";
    String Dot = "";
    String determine = "";

   

    /**
     * The available operators of the calculator.
     */
    public enum Operator {     
        CLEAR,       // C
        CLEAR_ENTRY, // CE
        BACKSPACE,   // ⌫
        EQUAL,       // =
        PLUS,        // +
        MINUS,       // -
        TIMES,       // ×
        OVER,        // ⁄
        PLUS_MINUS,  // ±
        RECIPROCAL,  // 1/x
        PERCENT,     // %
        SQRT,        // √
        MEM_CLEAR,   // MC
        MEM_SET,     // MS
        MEM_PLUS,    // M+
        MEM_MINUS,   // M-
        MEM_RECALL   // MR
    }
    /**
     * 
     * @param digit :按下數字0-9
     */
    public void appendDigit(int digit) {          
      num += String.valueOf(digit);
      getDisplay();
    }
    
   /**
    * 
    * @param dot :按下小數點
    */
    public void appendDot(String dot) {         
        Dot += dot;
        getDisplay();
       
    }
    /**
     * 
     * @param operator :依照運算符號去執行運算
     */
    public void performOperation(Operator operator) {    
       
        switch(operator){
            case CLEAR:
                num = "0";
                getDisplay();
                num = "";
              break;
            case EQUAL:
               switch(determine){
                    case "+":
                        y = Integer.parseInt(num);
                        num = String.valueOf(x + y);
                        getDisplay();
                        num ="";
                        break;
                    case "-":
                       y = Integer.parseInt(num);
                        num = String.valueOf(x - y);
                        getDisplay();
                        num="";
                         break;
                    case "x":
                       y = Integer.parseInt(num);
                        num = String.valueOf(x * y);
                        getDisplay();
                        num ="";
                         break;
                    case "÷":
                       y = Integer.parseInt(num);
                        num= String.valueOf(x / y);
                        getDisplay();
                        num ="";
                         break;
               }
              
                break;
            case PLUS:
                x = Integer.parseInt(num);
                num = "";
                getDisplay();
                determine = "+";
                break;
            case MINUS:
                x= Integer.parseInt(num);
                num = "";
                getDisplay();
                determine = "-";
                break;
            case TIMES:
                x = Integer.parseInt(num);
                num = "";
                getDisplay();
                determine = "x";
                break;
            case OVER:
                x = Integer.parseInt(num);
                num = "";
                getDisplay();
                determine = "÷";
                break;
            case PLUS_MINUS:
                break;
            case RECIPROCAL:
                break;
            case PERCENT:
                break;
            case SQRT:
                break;
            case MEM_CLEAR:
                break;
            case MEM_SET:
                break;
            case MEM_PLUS:
                break;
            case MEM_MINUS:
                break;
            case MEM_RECALL:
                break;
            case CLEAR_ENTRY:
                break;
            case BACKSPACE:
                break;
            
                
        
        }
    }
      /**
       * update data 
       * @return 
       */
    public String getDisplay() {              
        // TODO code application logic here
        setChanged();
        notifyObservers(num);
        return null;
    }
    /**
     *依照Controller傳送運算符號去執行各種運算功能
     * @param text 用來存取運算符號 
     */
    public void notation(String text)
    {
        if(text == "+") performOperation(Operator.PLUS);
        if(text == "=") performOperation(Operator.EQUAL);
        if(text == "C") performOperation(Operator.CLEAR);
        if(text == "-") performOperation(Operator.MINUS);
        if(text == "x") performOperation(Operator.TIMES);
        if(text == "÷") performOperation(Operator.OVER);
    }

   
 }


