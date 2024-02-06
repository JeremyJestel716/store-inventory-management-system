package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //get count of items in inventory
        long par = partRepository.count();
        long pro = productRepository.count();
        //check to make sure inventory is empty before uploading sample database.
        if (par == 0 & pro == 0)
        {
            //make outsourced parts and update each field
            OutsourcedPart o1 = new OutsourcedPart();
            o1.setCompanyName("Colortown");
            o1.setName("Food dye");
            o1.setInv(5);
            o1.setPrice(5.0);
            o1.setId(100L);
            o1.setMin(1);
            o1.setMax(18);
            //save object to repo
            outsourcedPartRepository.save(o1);
            OutsourcedPart o2 = new OutsourcedPart();
            o2.setCompanyName("Hershey");
            o2.setName("Chocolate");
            o2.setInv(4);
            o2.setPrice(15.0);
            o2.setId(200L);
            o2.setMin(2);
            o2.setMax(19);
            outsourcedPartRepository.save(o2);
            InhousePart i1 = new InhousePart();
            i1.setPartId(72);
            i1.setName("Sugar");
            i1.setInv(3);
            i1.setPrice(7.5);
            i1.setId(300L);
            i1.setMin(1);
            i1.setMax(20);
            partRepository.save(i1);
            InhousePart i2 = new InhousePart();
            i2.setPartId(32);
            i2.setName("Eggs");
            i2.setInv(2);
            i2.setPrice(12.5);
            i2.setId(400L);
            i2.setMin(2);
            i2.setMax(20);
            partRepository.save(i2);
            InhousePart i3 = new InhousePart();
            i3.setPartId(43);
            i3.setName("Flour");
            i3.setInv(1);
            i3.setPrice(2.0);
            i3.setId(500L);
            i3.setMin(3);
            i3.setMax(20);
            partRepository.save(i3);
            //create products with info in parameters
            Product sugar = new Product("Sugar",20.0,11);
            Product choco = new Product("Chocolate Chip",30.0,6);
            Product redvelv = new Product("Red Velvet",10.0,8);
            Product christ = new Product("Christmas",10.0,7);
            Product snick = new Product("Snickerdoodle",15.0,14);
            //save products
            productRepository.save(redvelv);
            productRepository.save(sugar);
            productRepository.save(choco);
            productRepository.save(christ);
            productRepository.save(snick);
        }








    }
}
