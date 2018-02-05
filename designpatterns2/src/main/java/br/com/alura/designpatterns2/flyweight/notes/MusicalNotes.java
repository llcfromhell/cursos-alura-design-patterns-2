package br.com.alura.designpatterns2.flyweight.notes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.jfugue.realtime.RealtimeMidiParserListener;

import br.com.alura.designpatterns2.flyweight.notes.impl.Do;
import br.com.alura.designpatterns2.flyweight.notes.impl.DoSharp;
import br.com.alura.designpatterns2.flyweight.notes.impl.Fa;
import br.com.alura.designpatterns2.flyweight.notes.impl.La;
import br.com.alura.designpatterns2.flyweight.notes.impl.Mi;
import br.com.alura.designpatterns2.flyweight.notes.impl.Re;
import br.com.alura.designpatterns2.flyweight.notes.impl.Si;
import br.com.alura.designpatterns2.flyweight.notes.impl.Sol;

public class MusicalNotes {

	private static List<Class<? extends Note>> clazzes;
	private Map<String, Note> notas = new HashMap<String, Note>();
	
	static {
        clazzes = Arrays.asList(
                   Do.class, DoSharp.class, Re.class, Mi.class, Fa.class, 
                   Sol.class, La.class, Si.class);
   }

//	public Nota pega(String nome) {
//		
//		return Optional.ofNullable(notas.get(nome)).orElseGet(()-> {
//			
//			try {
//				Nota note = (Nota) Class.forName("br.com.alura.designpatterns2.flyweight."+nome).newInstance();
//				notas.put(nome, note);
//				return note;
//			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			return null;
//			
//		});
//		
//	}
	
	public Note get(String name) {
		
		try {
            if(!notas.containsKey(name)) {
                for(Class<? extends Note> clazz : clazzes) {
                    if(clazz.getSimpleName().toLowerCase().equals(name)) {
                        notas.put(name, (Note) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
		
	}

}
