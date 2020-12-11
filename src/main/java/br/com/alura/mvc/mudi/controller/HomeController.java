package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		
		pedido.setNomeProduto("Xiaomi Redmi Note 9S");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61ShPQu-u0L._AC_SL1200_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Redmi-Note-9S-Aurora-128GB/dp/B086CXR646?ref_=Oct_s9_apbd_otopr_hd_bw_bHjJhpz&pf_rd_r=QCJ18W76834RR7SQC91V&pf_rd_p=28a608c3-5e82-573f-9625-48e104a86c91&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=16243890011");
		pedido.setDescricao("Descrição qualquer");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		
		return "home";
	}
}
