package Isabekov.DAY1;

public class MyUSATax extends MyTax {
       int myDependents;
       int myChildren;
       public double myCalcTax(){
           if(myGrossIncome < 500000){
            return 6;
           }
           else if (myGrossIncome < 500000 && myChildren > 1 ) {
               return 10;
           }
           else {
               return 8;
           }
       }
         //  return myGrossIncome * 0.33 / myDependents;
}

