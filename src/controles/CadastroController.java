/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Produto;
import entidades.ProdutoDAO;

/**
 *
 * @author Jonathan
 */
public class CadastroController {
    
    public boolean cadastrarProduto(Produto p){
        ProdutoDAO pdao = new ProdutoDAO();
        
        return pdao.inserir(p);
    }
    
}
