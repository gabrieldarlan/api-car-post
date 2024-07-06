package br.com.portal.api.service.impl;

import br.com.portal.api.client.CarPostStoreClient;
import br.com.portal.api.dto.CarPostDTO;
import br.com.portal.api.service.CarPostStoreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarPostStoreServiceImpl implements CarPostStoreService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSales() {
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPost, String id) {
        carPostStoreClient.changeCarForSaleClient(carPost, id);
    }

    @Override
    public void removeCarForSale(String id) {
        carPostStoreClient.deleteCarForSaleClient(id);
    }
}
