package com.mycompany.exceptionhandlingthrow;

public class BusinessLayer {

    public String ageCheck(int age) throws BusinessException {
        if (age < 18) {
            BusinessException be = new BusinessException(": AGE_INVALID", ": Voting age should be greater than 18 years");
            //System.out.println("Eligible for vote");
            throw be;
        } else {
            return "Eligible for vote";
        }
    }
    public String mAgeCheck(int age) throws BusinessException {
            if (age<21){
                BusinessException be = new BusinessException(": MARRIAGE_INVALID", ": Marriage age should be greater than 21 years");
                //System.out.println("Eligible for vote");
                throw be;
            }
            else{
                return "Eligible for marriage";
        }

        }
    }

