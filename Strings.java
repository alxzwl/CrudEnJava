import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Strings {

	public static void main(String[] args) {
		
		/*
		String sentencia = "Hola Mundo";
		StringBuilder sb = new StringBuilder(sentencia);
		sb.reverse();
		String texto;
		texto = sb.toString();
		JOptionPane.showMessageDialog(null, texto);
		*/
		
		/*
		String s = "Texto";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String texto;
		texto = sb.toString();
		JOptionPane.showMessageDialog(null, sb);
		*/
		
		/*
		String s = "Welcome";
		char[] ch = s.toCharArray(); 
		String text = ""; 
		for (int i = ch.length - 1; i >= 0; i--) {
			text = text + ch[i]; } System.out.println("Original string: " +s); 
		System.out.println("Reversed string: " + text);	
		*/
		
		String s = "texto";
		char[] ch = s.toCharArray();
		List<Character> l = new ArrayList<>();
		for(char c :ch) {
			l.add(c);
		}
		Collections.reverse(l);
		
		JOptionPane.showMessageDialog(null, l);
		System.out.println(l);
	}
}
