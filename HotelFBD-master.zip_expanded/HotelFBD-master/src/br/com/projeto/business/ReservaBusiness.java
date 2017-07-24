package br.com.projeto.business;

import java.util.List;

import br.com.projeto.dao.IReservaDao;
import br.com.projeto.dao.ReservaDao;
import br.com.projeto.entidades.Reserva;

public class ReservaBusiness implements IReservaBusiness {

	private IReservaDao reservaDao;

    public ReservaBusiness() {
        this.reservaDao = new ReservaDao();
    }

    @Override
    public boolean salvarOuEditar(Reserva reserva) {
        try {
            if (reserva.getId() == null) {
                reserva = reservaDao.salvar(reserva);
                
                return true;
            }
            if (reserva.getId() != null) {
                reservaDao.editar(reserva);
                return true;
            }

        } catch (Exception e) {
                e.printStackTrace();
        }
        return false;
	}

	@Override
	public Reserva buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
