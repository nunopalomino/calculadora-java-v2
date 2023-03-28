package Modelo;

/**
 *
 * @author Aluno
 */
public class Validacao
{
    public Double num1;
    public Double num2;
    public String mensagem;
    
    public void validar(String numero1, String numero2, String operacao)
    {
        mensagem = "";
        
        try
        {
            num1 = Double.valueOf(numero1);
            num2 = Double.valueOf(numero2);
            
            if (operacao.equals("/") && (num2.equals(0.0))) {
                
                mensagem = "Impossivel dividir por zero.";
            }
        }
        catch (Exception e)
        {
            mensagem = "Erro de conversão";
        }
    }
}
