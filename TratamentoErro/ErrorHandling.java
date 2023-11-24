package TratamentoErro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ErrorHandling {

    public static void main(String[] args) {
        ErrorHandling error = new ErrorHandling();
        error.lerArquivo();
    }

    public List<Integer> lerArquivo(String arquivo) throws IOException{
      List<Integer> numeros = new ArrayList<>();

      try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){
          String linha;
          while ((linha = br.readLine()) != null) {
              // Converte a linha para um número inteiro e adiciona à lista
              int numero = Integer.parseInt(linha);
              numeros.add(numero);
          }

      }
        return numeros;
    }



}
