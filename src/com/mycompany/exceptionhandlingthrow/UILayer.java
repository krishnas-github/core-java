package com.mycompany.exceptionhandlingthrow;

public class UILayer  {
    public String ageCheck1(int age) throws BusinessException {
        BusinessLayer bl = new BusinessLayer();
        //System.out.println(bl.ageCheck(age));
        return  bl.ageCheck(age);
    }
    public String mAgeCheck1(int age) throws BusinessException {
        BusinessLayer bl = new BusinessLayer();
        //System.out.println(bl.ageCheck(age));
        return  bl.mAgeCheck(age);

    }





   // public UILayer(String s, String s1) {
        //super();
    }



/*    public String ageCheck(int age) throws BusinessException {
        BusinessLayer bl = new BusinessLayer();
        bl.ageCheck1(age);
        String str1 = bl.ageCheck1(age);
        return str1;

    }

    public String mAgeCheck(int age) throws BusinessException{
        BusinessLayer bl = new BusinessLayer();
        bl.mAgeCheck1(age);
        String str1 = bl.ageCheck1(age);
        return str1;
    }*/


