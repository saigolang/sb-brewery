package sb.springframework.sbbrewery.services;

import web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        BeerDto result = new BeerDto();

    return result.data();
    }
}
