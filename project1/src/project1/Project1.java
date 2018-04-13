/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
abstract class Project1 {
     public static void main (String[] args){
System.out.println("Welcome to the airline");
    Customer cu = new Customer();
    cu.Customer();
}}
class Customer extends Project1{
    static String name2;
    static int sale;
    static double sale1;
      public static void Customer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("User Name : ");
name2 =sc.nextLine();
    pcx pc = new pcx();
pc.msxing();
}}
class CustomerCheck extends Customer{
    private String a1 = "new",a2="mean";
    public static String zx;
    public void check(){
        String aa = this.a1;  String ab = this.a2;
        nation N = new nation();
        SelectRegion S = new SelectRegion();
switch(name2){
   case "new" : System.out.print(" VIP ");break;
    case "mean" : System.out.print(" VIP ");break;
    default:System.out.print("Normal");break;}
if(name2.equals(aa)||name2.equals(ab)){sale=5; sale1=0.95;zx="null"; System.out.println("\t5%");   S.selectregion();}
else{sale=0; sale1=1.00; System.out.println("\t???");   N.national();}
    }}
class nation {
    public static String zx;
    public static void national(){
Scanner sc = new Scanner(System.in);
String na,thai;
char check;
do{ System.out.print("Thai nation = Enter y" +"\nForeigner nation = Enter n"+ "\nYou Enter : ");
na = sc.nextLine();
check = na.charAt(0);
System.out.println("************************");
}while(check!='y'&&check!='Y'&&check!='n'&&check!='N');
if (check !='N' && check!='n'){zx="Thai";}
else if ((check !='Y' && check!='y')){zx="Foreigner";}
else {zx="null";}
SelectRegion S = new SelectRegion();
S.selectregion();
}}
class SelectRegion{
    static String Select,zx1;
    static int A;
    static pcx pc = new pcx();
    static Scanner sc = new Scanner(System.in);
public static void selectregion(){
     int select;
    do{ System.out.println("************************");
         System.out.println("\tเลือกภาคที่จะไป");
         System.out.println("North :\t\t1"+"\nNortheast :\t2"+"\nCentral Region :3"+"\nSouthern :\t4");
         System.out.println("------------------------------");
         System.out.print("Number is : ");
     select = sc.nextInt();
    }while(select !=1&&select !=2&&select !=3&&select !=4);
    if (select == 1){  Select="North"; North(); }
    else if (select == 2){  Select="Northeast"; Northeast(); }
    else if (select == 3){  Select="CentralRegion"; CentralRegion(); }
    else if (select == 4){  Select="Southern"; Southern(); }
}
public static void North(){ 
    int north;
do{  System.out.println("************************");
    System.out.println("Chiang Mai(1,500)  : \t1"+"\nMae Hong Son(1,400)  : \t2"+"\nPhitsanulok(1,200)  : \t3");
    System.out.println("------------------------------");
    System.out.print("Number is : ");
 north = sc.nextInt();
}while(north!=1&&north!=2&&north!=3);
if(north != 2 && north != 3){zx1="Chiang Mai";   A=1500;}
else if (north != 1 && north != 3){zx1="Mae Hong Son";   A=1400;}
else {zx1="Phitsanulok";   A=1200;}
pc.pcx();
}
public static void Northeast(){
         int northeast;
do{  System.out.println("************************");
System.out.println("Roi Et(1,600)  : \t1"+"\nNakhon Phanom(1,400)  : 2"+"\nKhon Kaen(1,000)  : \t3");
System.out.println("------------------------------");
System.out.print("Number is : ");
northeast = sc.nextInt();
}while(northeast!=1&&northeast!=2&&northeast!=3);
if( northeast != 2 && northeast != 3){zx1="Roi Et";   A=1600;}
else if (northeast != 1 && northeast != 3){zx1="Nakhon Phanom";   A=1400;}
else {zx1="Khon Kaen";   A=1400;}
pc.pcx();
}
public static void CentralRegion(){ 
int centralregion;
do{  System.out.println("************************");
System.out.println("Bangkok(1,200)  : 1"+"\nPattaya(1,400)  : 2");
System.out.println("------------------------------");
System.out.print("Number is : ");
centralregion = sc.nextInt();
}while(centralregion !=1&&centralregion !=2);
if( centralregion != 2){zx1="Bangkok";   A=1200;}
else {zx1="Pattaya";   A=1400;}
pc.pcx();
}
public static void Southern(){
int southern ;
do{  System.out.println("************************");
System.out.println("Hat Yai(1,000)  : \t1"+"\nPhuket(1,400)  : \t2"+"\nSurat Thani(1,200)  : \t3"+"\nTrang(1,400)  : \t4");
System.out.println("------------------------------");
System.out.print("Number is : ");
southern = sc.nextInt();
}while(southern!=1&&southern!=2&&southern!=3&&southern!=4);
if( southern != 2 && southern != 3 && southern != 4){zx1="Hat Yai ";   A=1000;}
else if (southern  != 1 && southern  != 3 && southern != 4){zx1="Phuket";   A=1400;}
else if (southern  != 1 && southern  != 2 && southern != 4){zx1="Surat Thani";   A=1200;}
else {zx1="Trang";   A=1400;}
pc.pcx();
}}
class Population implements Adult{
    public static  int a,b,c;
 public void Adulting(){
 SelectRegion Se = new SelectRegion();
     Scanner sc = new Scanner(System.in);    //int
     Scanner sc1 = new Scanner(System.in);    //String
     char ceat;
     do{  System.out.println("**จำนวนผู้โดยสาร**");
   System.out.print("Number Adult : "); 
  a=sc.nextInt();
   System.out.print("Number Child : ");
   b=sc.nextInt();
  System.out.print("Number Baby :  ");
  c=sc.nextInt();
   System.out.print("OK ป่าว ok กด y : "); // check
   String gosc=sc1.nextLine();
   System.out.println("************************");
   ceat=gosc.charAt(0);
     }while  (ceat!='y'&&  ceat!='Y');
  Print p = new Print();
   p.print();
}}
interface Adult{
abstract void Adulting();}
interface pcr{
abstract void pcx();}
interface pci{
abstract void pcx1();}
interface msx{
abstract void msxing();}
interface sms{
abstract void smsing();}
class pcx implements pcr,pci,msx,sms{
    static Scanner sc1 = new Scanner(System.in);
    private char ceat;
    static SelectRegion Se = new SelectRegion();
public void pcx(){ // checkว่าไป ไหม ของ จังหวันนั้น  
    Population P = new Population();
System.out.print("OK ป่าว ok กด y : ");
   String gosc=sc1.nextLine();
   System.out.println("********************");
   ceat=gosc.charAt(0);
   if(ceat!='y'&&  ceat!='Y'){Se.selectregion();}//ขึ้นไปเลือกภาคใหม่
   else{P.Adulting();} //ไปถามจำนวนคน
}
public void pcx1(){
System.out.print("จะเอาอีกไหม : ถ้าไม่เอาเพิ่มกด N แต่ถ้าเพื่มกด Y : ");
   String go=sc1.nextLine();
   ceat=go.charAt(0);
   if(ceat>='y'&&  ceat>='Y'){smsing();}
   else if (ceat>='n'&&  ceat>='N'){ System.out.println("***********Thank you***********");}
   else{pcx1();}
}
public void msxing(){// check ใช่ป่าวของ Usuer
    CustomerCheck ch = new CustomerCheck();
    Customer cu = new Customer();
System.out.print(">>>>You Sure<<<<< "+"\nSure y : ");
   String go=sc1.nextLine();
    ceat=go.charAt(0);
  System.out.println("********************");
   if(ceat!='y' && ceat!='Y'){cu.Customer();} //ไปใส่ใหม่
   else {ch.check();} // ไปส่วนของ สมาชิก กับ ไม่เป็นสมาชิก 
}
public void smsing(){
    CustomerCheck ch = new CustomerCheck();
    Customer cu = new Customer();
    do{   System.out.print("Will you be the same name? \nSure : y \tNo sure : n \nAnswer : ");
   String gosc=sc1.nextLine();
    ceat=gosc.charAt(0);
  System.out.println("********************");
    }while (ceat!='y' && ceat!='Y' && ceat!='n' && ceat!='N');
   if(ceat!='y' && ceat!='Y'){cu.Customer();}
   else {Se.selectregion();}
}}
abstract class PO{
  static int po;
public static int po1(int po){
Population P = new Population();
po =P.a+P.b+P.c;
return po;
}}
class SSD extends Print {
    static double pay;
public static void hbd(){
Scanner sc = new Scanner(System.in);
    int ass=0 , g=0;
    System.out.println("------------------------------");
    for (int f=5 ; ass<f ; ass++){
        System.out.print("Enter money to pay : ");  //รับเงินมา5ครั้ง
pay=sc.nextDouble();
if (pay >= sum){ass=5;  g=1;} 
else{System.out.println("<<<<<Try again>>>>>"+"\n------------------------------");  g=2;}  } 
    double oop=pay-sum;
    if (g==1){System.out.println("เงินทอน =\t "+oop+"฿");
        System.out.println("<<<<<Thank you>>>>>"+"\n------------------------------");
            pcx pc = new pcx();  
            pc.pcx1();}
    else{v1();}  }
public static void v1(){
    char ceat;
    Scanner sc1 = new Scanner(System.in);
    CustomerCheck ch = new CustomerCheck();
    Customer cu = new Customer();
    SelectRegion S = new SelectRegion();
    do{
System.out.print("Error \tPress:y to try again  Press:n to stop\nEnter :");
   String go=sc1.nextLine();
    ceat=go.charAt(0);
  System.out.println("********************");
    }while(ceat!='y'&&ceat!='Y'&&ceat!='n'&&ceat!='N');
   if(ceat!='y' && ceat!='Y'){cu.Customer(); }//
   else {S.selectregion();} // 
}}
class Print extends PO{
    static double sum = 0, sum1 = 0, sum2 = 0;
    static Customer cu= new Customer();
    static Population P = new Population();
    static SelectRegion S = new SelectRegion();
    public static double salary(){
    sum1= cu.sale1*(P.a*S.A);
    sum2= cu.sale1*((P.b*S.A)-(P.b*400));
    sum=sum1+sum2;
    System.out.println("\t>>ผู้โดยสาร<<");
    System.out.println("Adult is : "+P.a+"คน"+"\t"+sum1+"฿");
    System.out.println("Child is : "+P.b+"คน"+"\t"+sum2+"฿");
    System.out.println("Baby  is : "+P.c+"คน"+"\tFree.0฿");
   return sum;
    }
    public static void print(){
        String a1 = "new",a2="mean";
        System.out.println("------------------------------");
        System.out.println("\t\t>>>>>slip<<<<<");
        System.out.println("User Name : " +cu.name2);
        System.out.println("You have a discount : "+cu.sale +"%");
     nation N = new nation();
     CustomerCheck ch = new CustomerCheck();
     if(cu.name2.equals(a1)||cu.name2.equals(a2)){System.out.println("nationality : "+ch.zx);}
     else {System.out.println("nationality : "+N.zx);}
     System.out.println("Go to : "+S.Select+"\t>>"+S.zx1+"\t"+S.A+"฿");
     System.out.println("<<Promotion for children  and baby>>" );
     System.out.println("Children : decrease 400฿/1 \nBaby \t : Free฿");
     System.out.println("Total is : "+po1(po)+"คน\t"+salary()+"฿");
      SSD d = new SSD();
      d.hbd(); //ใส่เงิน
    }}