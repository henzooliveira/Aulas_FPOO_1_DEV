
package orientacaoobjetos.post;

public class RedeSocial implements ClassificacaoPost{
    private String descricao;
    private int ClassificacaoPost;
    private int curtidas;
    private int comentarios;

    public RedeSocial(String descricao, int curtidas, int comentarios) {
        this.descricao = descricao;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
    }

    
    
    public String getDescricao() {
        return descricao;
    }

    public int getClassificacaoPost() {
        return ClassificacaoPost;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getComentarios() {
        return comentarios;
    }
    
    public boolean avaliarEstPost(int ClassificacaoPost) {
         if (ClassificacaoPost == 1) {
            System.out.println("Comum");
            return true;
       
        }
        if (ClassificacaoPost == 3) {
            System.out.println("Legal");
            return true;
        }
                
        if (ClassificacaoPost == 5) {
            System.out.println("Muito legal");
            return true;
        
        } else {
            System.out.println("Sem avaliação");
            return false;
        }
    }

    @Override
    public String toString() {
        return "RedeSocial{" + "descricao=" + descricao + ", ClassificacaoPost=" + ClassificacaoPost + ", curtidas=" + curtidas + ", comentarios=" + comentarios + '}';
    }
    

}
        


        
    

    

