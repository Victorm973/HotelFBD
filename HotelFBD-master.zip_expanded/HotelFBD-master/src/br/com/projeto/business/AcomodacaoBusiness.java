package br.com.projeto.business;

import java.util.List;

import br.com.projeto.dao.IAcomodacaoDao;
import br.com.projeto.dao.AcomodacaoDao;
import br.com.projeto.entidades.Acomodacao;

public class AcomodacaoBusiness implements IAcomodacaoBusiness {

	private IAcomodacaoDao acomodacaoDao;

    public AcomodacaoBusiness() {
        this.acomodacaoDao = new AcomodacaoDao();
    }

    @Override
    public boolean salvarOuEditar(Acomodacao acomodacao) {
        try {
            if (acomodacao.getId() == null) {
                acomodacao = acomodacaoDao.salvar(acomodacao);
                
                return true;
            }
            if (acomodacao.getId() != null) {
                acomodacaoDao.editar(acomodacao);
                return true;
            }

        } catch (Exception e) {
                e.printStackTrace();
        }
        return false;
	}
	@Override
	public Acomodacao buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Acomodacao> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
