package arvoredecisao;
public class ArvoreDecisao {
    public static void main(String[] args) {
       ArvDecisao arvore = new ArvDecisao();
       System.out.print("Árvore de Decisão para verificar se você possui dengue, responda apenas com sim ou nao\n");
       arvore.insereNode("Febre alta com início súbito?\n", 50);
       arvore.insereNode("Perda do paladar e apetite?\n", 30);
       arvore.insereNode("Dores de cabeça?\n", 70);
       arvore.insereNode("Extremo cansaço?\n", 20);
       arvore.insereNode("Naúseas ou vômito?\n", 40);
       arvore.insereNode("Dores atrás dos olhos que piora de acordo com os movimentos?\n", 60);
       arvore.insereNode("Está sentindo tonturas?\n", 80);
       arvore.insereNode("Você não tem dengue e está SAUDÁVEL!\n", 0);
       arvore.insereNode("A possibilidade de ser dengue é de 5%, não se apavore e descanse um pouco!\n", 25);
       arvore.insereNode("A probabilidade de ser dengue é de 35%, pode ser desidratação, procure um médico!\n", 35);
       arvore.insereNode("Pode não ser dengue. Mas mesmo assim procure um enfermeiro!\n", 45);
       arvore.insereNode("Pode não ser dengue, as chances são de 50%. Procure um enfermeiro!\n", 55);
       arvore.insereNode("Há 65% de chance de ser dengue!! Vá até um hospital e se cuide. \n", 65);
       arvore.insereNode("Há 75% de chance de ser dengue!! Vá até um hospital e se cuide.\n", 75);
       arvore.insereNode("Chances de ser dengue: 100%, procure um médico urgente\n", 100);
       
       arvore.preorderTraversal();
    }
    
}
