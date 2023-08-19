package Listas;

public class ClsTaskList {

    private String takName;
    private String takDescripcion;

    public String getTakName() {
        return takName;
    }

    public void setTakName(String takName) {
        this.takName = takName;
    }

    public String getTakDescripcion() {
        return takDescripcion;
    }

    public void setTakDescripcion(String takDescripcion) {
        this.takDescripcion = takDescripcion;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    private boolean isDone;


}
