/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author adrian.glapinski
 */
@Named(value = "sumBean")
@RequestScoped
public class SumBean {

    /**
     * Creates a new instance of SumBean
     */
    public SumBean() {
    }

    private Integer firstNumber;
    private Integer secondNumber;
    private Integer sumResult;

    public void calculateSum() {
        sumResult = firstNumber + secondNumber;

        String sumText = firstNumber + " + " + secondNumber + " = " + sumResult;
        
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(sumText);
        context.addMessage("sumResultGrowl", message);
    }

    public Date getCurrentDate() {
        return new Date();
    }

    /**
     * @return the firstNumber
     */
    public Integer getFirstNumber() {
        return firstNumber;
    }

    /**
     * @param firstNumber the firstNumber to set
     */
    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * @return the secondNumber
     */
    public Integer getSecondNumber() {
        return secondNumber;
    }

    /**
     * @param secondNumber the secondNumber to set
     */
    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * @return the result
     */
    public Integer getSumResult() {
        return sumResult;
    }

    /**
     * @param result the result to set
     */
    public void setSumResult(Integer result) {
        this.sumResult = result;
    }

}
