package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Hicham BAHIR")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        log.debug("Saving the customer");
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Hicham BAHIR")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("updating the customer " + customerId);
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("deleting the customer " + customerId);
    }
}
