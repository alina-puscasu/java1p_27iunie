//Decorator design pattern

public class FluxHighLevel {
    private FluxLowLevel fluxLowLevel;
    
    public FluxHighLevel(FluxLowLevel fluxLowLevel) {
        this.fluxLowLevel = fluxLowLevel;
    }
    
    public void read() {
        fluxLowLevel.readBytes();
        System.out.println("Convertire de la bytes la String");
    }
}