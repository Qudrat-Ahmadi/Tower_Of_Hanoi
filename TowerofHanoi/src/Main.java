public class Main {
    public static void shiftdisk(int n,char Ta,char Tb ,char Tc){
        if(n==1){
            System.out.println("Disk 1 This is Shifted from  "+Ta +"  to  "+Tc);
        }else{
            shiftdisk(n-1,Ta,Tc,Tb);
            System.out.println("Disk  "+n+" From "+Ta+" is shifted to  "+Tb);
            shiftdisk(n-1,Tb,Ta,Tc);
        }
    }
    public static void main(String[] args) {   // Main Method
        int n=3;
shiftdisk(n,'A','B','C');  // Call Static method
    }
}
