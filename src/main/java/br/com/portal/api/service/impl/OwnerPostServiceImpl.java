package br.com.portal.api.service.impl;

import br.com.portal.api.client.CarPostStoreClient;
import br.com.portal.api.dto.OwnerPostDTO;
import br.com.portal.api.service.OwnerPostService;

public class OwnerPostServiceImpl implements OwnerPostService {

    private final CarPostStoreClient carPostStoreClient;

    public OwnerPostServiceImpl(CarPostStoreClient carPostStoreClient) {
        this.carPostStoreClient = carPostStoreClient;
    }

    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
