/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import tw.edu.npu.mis.Calculator.Operator;

/**
 *
 * @author Even
 */



public class Controller {
  /**
   * 宣告 Calculator mModel and  View mView
   */   
    View mView;
    Calculator mModel;
   
   
   /**
    * 
    * @param model :Controller 知道Model 的attribute and methods
    */
    public Controller(Calculator model) {
       
       mModel = model;  
    }

  
   /**
    * 
    * @param data :傳數字
    */
    public void setData(String data)
    {
        mModel.appendDigit(Integer.parseInt(data));
        
    }
   /**
    * 
    * @param dot :傳小數點
    */
    public void setDot(String dot)
    {
        mModel.appendDot(dot);
    }
    
   /**
    *
    * @param Operator : 傳送運算符號(+-x÷)
    */
   public void notation(String Operator)
    {
        mModel.notation(Operator);
    }
    
    /**
     *  
     * @param view :add View 到Controller
     */
    public void addView(View view){
		mView = view;
                mModel.getDisplay();
   
    }
    
  
}