package store.Projeto.E.commerce.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import store.Projeto.E.commerce.entity.Produto;
import store.Projeto.E.commerce.repository.ProdutoRepository;

@Controller
@RequestMapping(path = "/api/produto")
@CrossOrigin ("*")
public class ProdutoController {
    @Autowired
    ProdutoRepository pRepository;

    @PostMapping("/")
    public @ResponseBody Integer addProduto(@RequestBody Produto objP ){
        pRepository.save(objP);
        return objP.getId();
    }

    @PutMapping("/")
    public @ResponseBody Produto atualizar(@RequestBody Produto objP){
        pRepository.save(objP);
        return objP;
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Produto> buscarProduto(@PathVariable Integer id){
        return pRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String apagar(@PathVariable Integer id) {
        pRepository.deleteById(id);
        return "Produto Apagado com Sucesso";
    }
}
