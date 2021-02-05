/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Server onDemandE2HighCPU2 = new OnDemandE2HighCPU2();
        onDemandE2HighCPU2 = new PreEmptiblevCPU(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new PreEmptiblevCPU(onDemandE2HighCPU2);

        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);

        System.out.println(onDemandE2HighCPU2.getDescription());
        System.out.println(onDemandE2HighCPU2.cost());

        Server preEmptibleE2HighCPU2 = new PreemptibleE2HighCPU2();
        preEmptibleE2HighCPU2 = new PreEmptiblevCPU(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new PreEmptiblevCPU(preEmptibleE2HighCPU2);

        preEmptibleE2HighCPU2 = new OnDemandMemory(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new OnDemandMemory(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new OnDemandMemory(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new OnDemandMemory(preEmptibleE2HighCPU2);

        System.out.println(preEmptibleE2HighCPU2.getDescription());
        System.out.println(preEmptibleE2HighCPU2.cost());
    }    
}
