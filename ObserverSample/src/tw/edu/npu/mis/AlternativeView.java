/*
 * Copyright (c) 2015, STP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package tw.edu.npu.mis;


/**
 *{link AlternativeView} generates outputs to the user.
 * Implements Observer Interface.
 * @author Even
 */
public class AlternativeView implements Observer {
    //Use private define constants.
    private final String mName;
    private final Window mWindow;
    private final Model mModel;
    private boolean mIsValid;
    /**
     * 
     * @param name:Set the initial name.
     * @param window:Set the initial window.
     * @param model :Set the initial model.
     */
  
    public AlternativeView(String name, Window window, Model model) {
        this.mName = name;
        this.mWindow = window;
        this.mModel = model;
    }
    /**
     * Content has not been updated.
     * @return 
     */
    public boolean isValid() {
        return mIsValid;
    }
    /**
     * Show the reversed content of the model on the console.
     * 
     */
    public void show() {
        System.out.print("AlternativeView: ");
        System.out.println(new StringBuilder(mModel.getData()).reverse());
        mIsValid = true;
    }
        @Override
    public void update() {
        show();
    }
}
