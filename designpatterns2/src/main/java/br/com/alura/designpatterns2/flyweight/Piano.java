package br.com.alura.designpatterns2.flyweight;

import java.util.List;

import org.jfugue.player.Player;

import br.com.alura.designpatterns2.flyweight.notes.Note;

public class Piano {
	
	public void toca(List<Note> song) {
		Player player = new Player();
		
		StringBuilder songNotation = new StringBuilder();
        for(Note note : song) {
            songNotation.append(note.getSymbol() + " ");
        }

        player.play(songNotation.toString());
		
	}

}
