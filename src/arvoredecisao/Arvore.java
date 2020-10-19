package arvoredecisao;

public class Arvore {

  Arvore esquerdaNode;
  String pergunta;
  float chance; 
  Arvore direitaNode;

   

  public Arvore(String pergunta, float chance){
      this.pergunta = pergunta;
      this.chance = chance;
    esquerdaNode = direitaNode = null;
  }


  public void insereNode(String pergunta, float chance){
        if(chance < this.chance) {
          if(esquerdaNode == null) {
          esquerdaNode = new Arvore(pergunta, chance);
      }
          else {
          esquerdaNode.insereNode(pergunta, chance);
      }}
                
          if (chance > this.chance){
                if(direitaNode == null) {
          direitaNode = new Arvore(pergunta , chance);
      }
                else {
          direitaNode.insereNode(pergunta, chance);
      }}
            
        
  } }
