package br.com.projeto.business;

import java.util.List;

import br.com.projeto.dao.ServicoDao;
import br.com.projeto.dao.IServicoDao;
import br.com.projeto.entidades.Servico;

public class ServicoBusiness implements IServicoBusiness {

	private IServicoDao servicoDao;

    public ServicoBusiness() {
        this.servicoDao = new ServicoDao();
    }

    @Override
    public boolean salvarOuEditar(Servico servico) {
        try {
            if (servico.getId() == null) {
                servico = servicoDao.salvar(servico);
                
                return true;
            }
            if (servico.getId() != null) {
                servicoDao.editar(servico);
                return true;
            }

        } catch (Exception e) {
                e.printStackTrace();
        }
        return false;
	}

	@Override
	public Servico buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Servico> getAll() {
		return servicoDao.getAll();
	}

}
