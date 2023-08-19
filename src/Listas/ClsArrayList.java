package Listas;
import java.util.ArrayList;
import java.util.List;

public class ClsArrayList {

    private int tarea_numero = 1;

    public void ejemplo1() {
        List<String> list = new ArrayList<String>();

        list.add("hacer compras");
        list.add("sacar perro");
        list.add("hacer la cama");
        list.add("lavar el carro");
        list.add("ir a votar");
        //System.out.println(list);


// String primerTarea = list.get(0);
// System.out.println("primer tarea: " + primerTarea);


// list.remove(0);


// primerTarea = list.get(0);
        //System.out.println("nuevo primer tarea: " + primerTarea);

        //iteracion


        // ... (rest of your code)

        listaTareas(); // Call the method to display task details
    }

    public void listaTareas() {
        List<ClsTaskList> taskList = new ArrayList<>();

        ClsTaskList tareaIndividual = new ClsTaskList();
        tareaIndividual.setTakName("hacer compras");
        tareaIndividual.setTakDescripcion("ir a la tienda");
        tareaIndividual.setDone(false);
        taskList.add(tareaIndividual);

        tareaIndividual = new ClsTaskList();
        tareaIndividual.setTakName("sacar al perro");
        tareaIndividual.setTakDescripcion("llevarlo al parque");
        tareaIndividual.setDone(false);
        taskList.add(tareaIndividual);

        tareaIndividual = new ClsTaskList();
        tareaIndividual.setTakName("hacer la cama");
        tareaIndividual.setTakDescripcion("arreglar las sábanas");
        tareaIndividual.setDone(false);
        taskList.add(tareaIndividual);

        tareaIndividual = new ClsTaskList();
        tareaIndividual.setTakName("ir a votar");
        tareaIndividual.setTakDescripcion("cumplir con el deber cívico");
        tareaIndividual.setDone(false);
        taskList.add(tareaIndividual);


        taskList.get(1).setDone(true);
        taskList.get(3).setDone(true);


        for (ClsTaskList tl : taskList) {
            if (tl.isDone()) {
                System.out.println("Tarea " + tarea_numero + ": " + tl.getTakName() + " - Descripción: " + tl.getTakDescripcion());
                tarea_numero++;
            }
        }
    }

    }

