package cl.corona.bbookvendor.scheduler;

import cl.corona.bbookvendor.model.BbookEnviaVendor;
import cl.corona.bbookvendor.repository.BbookEnviaVendorRepository;
import cl.corona.bbookvendor.services.VendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScheduledTasks {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired
    private VendorService vendorService;

    private BbookEnviaVendorRepository bbookenviovendorrepository;


    @Autowired
    public ScheduledTasks(BbookEnviaVendorRepository bbookenviovendorrepository) {
        this.bbookenviovendorrepository = bbookenviovendorrepository;
    }

    @Scheduled(cron = "${cron.expression}")
    public void scheduledBbook() throws InterruptedException {
        LOG.info("{} : Generacion periodica para el envio de Proveedores  - {}",
                dateTimeFormatter.format(LocalDateTime.now()));

        // Date exceptions
        LocalDate today = LocalDate.now();
        int count = 0;
        List<BbookEnviaVendor> Bbookdimens = new ArrayList<>();

        try {
            String statusBrand = "T";
            Bbookdimens = (List<BbookEnviaVendor>) bbookenviovendorrepository.findAllByTranType("A");

        } catch (InvalidDataAccessResourceUsageException e) {
            LOG.error("{}: Ocurrio un error al momento de rescatar las Marcas: ", e);
            return;
        }

        LOG.info("Cantidad de Marcas para generar: {}", Bbookdimens.size());

        if (Bbookdimens.size() > 0) {
            vendorService.EnvioVendors(Bbookdimens, "A");
        }

        try {
            String statusBrand = "T";
            Bbookdimens = (List<BbookEnviaVendor>) bbookenviovendorrepository.findAllByTranType("C");

        } catch (InvalidDataAccessResourceUsageException e) {
            LOG.error("{}: Ocurrio un error al momento de rescatar las Marcas: ", e);
            return;
        }

        LOG.info("Cantidad de Marcas para generar: {}", Bbookdimens.size());

        if (Bbookdimens.size() > 0) {
            vendorService.EnvioVendors(Bbookdimens, "C");
        }

        try {
            String statusBrand = "T";
            Bbookdimens = (List<BbookEnviaVendor>) bbookenviovendorrepository.findAllByTranType("D");

        } catch (InvalidDataAccessResourceUsageException e) {
            LOG.error("{}: Ocurrio un error al momento de rescatar las Marcas: ", e);
            return;
        }

        LOG.info("Cantidad de Marcas para generar: {}", Bbookdimens.size());

        if (Bbookdimens.size() > 0) {
            vendorService.EnvioVendors(Bbookdimens, "D");
        }
    }
}
