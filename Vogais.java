public class Vogais {
    
    /**
     * Método responsável por contar as vogais de um texto
     * @param text Texto de entrada
     * @return quantidade de caracteres vogais incluídos no texto
     */
    public int contarVogais(String text){
      int contador = 0;
      text = text.toLowerCase();
      for(int i = 0; i < text.length(); i++){
          char letra = text.charAt(i);

        if("aeiouáàâãéêèíìîóòôõúùû".contains(String.valueOf(letra))){
              contador++;
        }

    }
      return contador;
  }
}