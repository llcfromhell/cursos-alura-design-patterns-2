package br.com.alura.designpatterns2.flyweight;

import java.util.Arrays;
import java.util.List;

import br.com.alura.designpatterns2.flyweight.notes.MusicalNotes;
import br.com.alura.designpatterns2.flyweight.notes.Note;

public class MusicBox {

	public static void main(String[] args) {

		MusicalNotes notas = new MusicalNotes();

		List<Note> musica = Arrays.asList(
				notas.get("si"), 
				notas.get("re"), 
				notas.get("mi"), 
				notas.get("sol"), 
				notas.get("fa"),
				notas.get("sol"), 
				notas.get("fa"), 
				notas.get("re"), 
				notas.get("mi"),
				notas.get("dosharp")
			);
		
		Piano piano = new Piano();
		piano.toca(musica);

	}

}
