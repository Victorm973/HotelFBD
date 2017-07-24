package br.com.projeto.business;

import java.util.List;

import br.com.projeto.dao.IVinculoClienteServicoDao;
import br.com.projeto.dao.VinculoClienteServicoDao;
import br.com.projeto.entidades.VinculoClienteServico;

public class VinculoClienteServicoBusiness implements IVinculoClienteServicoBusiness {

	private IVinculoClienteServicoDao vinculoClienteServicoDao;

    public VinculoClienteServicoBusiness() {
        this.vinculoClienteServicoDao = new VinculoClienteServicoDao();
    }

    @Override
    public boolean salvarOuEditar(VinculoClienteServico vinculo) {
        try {
            if (vinculo.getId() == null) {
                vinculo = vinculoClienteServicoDao.salvar(vinculo);
                
                return true;
            }
            if (vinculo.getId() != null) {
                vinculoClienteServicoDao.editar(vinculo);
                return true;
            }

        } catch (Exception e) {
                e.printStackTrace();
        }
        return false;
	}

	@Override
	public VinculoClienteServico buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VinculoClienteServico> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
