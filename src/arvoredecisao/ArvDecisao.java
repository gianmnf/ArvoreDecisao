package arvoredecisao;

import java.util.Scanner;

public class ArvDecisao {

  private Arvore raiz; 
  String resposta;
  Scanner in = new Scanner (System.in);
    
       
  public ArvDecisao(){
    raiz = null;  
    }
  //os dados inseridos na classe principal, são passados pra esse parametro 
  public void insereNode(String insertPergunta, float insertChance){
    if (raiz == null) {
          raiz = new Arvore(insertPergunta, insertChance);
      }
    else {
          raiz.insereNode(insertPergunta, insertChance);
      }
  }
  
  //começa percurso na pré-ordem
  public void preorderTraversal(){
    preorderHelper(raiz);   
  }
//método recursivo para fazer percurso na pré-ordem
  private void preorderHelper(Arvore node){
    if (node == null) {
          return ;
      }
     System.out.print(node.pergunta);
    //verifica se o no atual é a folha da arvore
    if((node.esquerdaNode == null) && (node.direitaNode == null)){
        System.exit(0);
    }
    String resposta;    
   
    resposta = in.next();
    
      if("sim".equals(resposta)){      
    //percorre a subarvore a esquerda
    preorderHelper(node.direitaNode);
      }
      if("nao".equals(resposta)){
      //percorre a subarvore a direira
      preorderHelper(node.esquerdaNode);
      }
  }
  
  public void posOrdemTrans(){
      posOrdem(raiz);
  };
  
  public void posOrdem(Arvore node){
      if (node == null) {
          return ;
      }
      
      System.out.println(node.pergunta);
      posOrdem(node.esquerdaNode);
      posOrdem(node.direitaNode);
  }
}