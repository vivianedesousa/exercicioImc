import java.util.Scanner;

class Main {
  public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Digite seu peso");
        float peso =  input.nextFloat();
	System.out.println("Digite sua altura");
        float altura= input.nextFloat();  
	System.out.println("---> SEU IMC <----");
        float gordura=calcularAtaxaImc(peso,altura);
	System.out.println("Voce esta na Categoria");
        categoriaImc (gordura);
  }
  public static  float calcularAtaxaImc(float peso,float altura){
    float imc=0.0f;   
    imc=peso/(altura * altura);
    System.out.println(imc);
    return imc;
 }
  public static void categoriaImc(float imc){
    if(imc < 18.5f){
      System.out.println(" vai ser abaixo do peso");
    }else if(imc >= 18.6 && imc<=24.9){
      System.out.println("peso ideal"); 
    }else if(imc>=25.0f && imc<=29.9f){
      System.out.println("levemente acima do peso"); 
    }else if(imc >= 30.0f &&imc<=34.9f){
      System.out.println("obsidade grau I"); 
    }else if (imc >= 35.0f &&imc<=39.9f){
      System.out.println("obsidade grau II");   
    }else if (imc>=40.0){
      System.out.println("obsidade III");   
    }
  }
}