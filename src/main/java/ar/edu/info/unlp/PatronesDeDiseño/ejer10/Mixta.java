// package ar.edu.info.unlp.PatronesDeDiseño.ejer10;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.List;

// public class Mixta implements TopografiaComponente {
//     private List<TopografiaComponente> topografias;

//     public Mixta() {
//         topografias = new ArrayList<TopografiaComponente>();
        
//     }

//     @Override
//     public double getProporcionDeAgua()
//     {
//         return topografias.stream().mapToDouble(t -> t.getProporcionDeAgua()).sum();
//     }

//     @Override 
//     public double getProporcionDeTierra()
//     {
//         return 1 - this.getProporcionDeAgua();
//     }

//     @Override
//     public boolean equals(TopografiaComponente obj) {
//         if (obj.getProporcionDeAgua() != this.getProporcionDeAgua()) {
//             return false;
//         }
//         for(TopografiaComponente t : topografias) {
//             if (!t.equals(obj)) {
//                 return false;
//             }
//         }


    
    
// }}
