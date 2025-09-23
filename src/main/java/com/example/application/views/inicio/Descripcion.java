package com.example.application.views.inicio;

import org.vaadin.lineawesome.LineAwesomeIconUrl;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
@PageTitle("descripcion")
@Route("mini descripcion de la plataforma")
@Menu(order = 1, icon = LineAwesomeIconUrl.FILE)


public class Descripcion {

    public Descripcion() {

     H2 header = new H2("bienvenido al portal de notas");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        
        
        

    }


    public class DescripcionPlataforma {

    public static void main(String[] args) {
        mostrarDescripcion();
    }

    public static void mostrarDescripcion() {
        System.out.println("🎓 Bienvenido a la Plataforma de Gestión de Notas Académicas");
        System.out.println("------------------------------------------------------------");
        System.out.println("Esta plataforma está diseñada para facilitar el seguimiento del rendimiento estudiantil");
        System.out.println("  Los profesores pueden:");
        System.out.println("   - Consultar promedios por estudiante y por materia");
       
        System.out.println();
        System.out.println("  Los estudiantes pueden:");
        System.out.println("   - ingresar  sus notas en tiempo  real  y si aprobo ");
        System.out.println("   - Visualizar su progreso académico");
        System.out.println();
        System.out.println("  Esta herramienta busca mejorar la comunicación entre docentes y alumnos,");
        System.out.println("   promoviendo una educación más transparente y efectiva");
    }
}


}
