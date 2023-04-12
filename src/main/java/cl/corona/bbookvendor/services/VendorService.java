package cl.corona.bbookvendor.services;

import cl.corona.bbookvendor.model.BbookEnviaVendor;
import cl.corona.bbookvendor.model.JsonCab;
import cl.corona.bbookvendor.model.JsonDet;
import cl.corona.bbookvendor.repository.BbookEnviaVendorRepository;
import cl.corona.bbookvendor.utilities.Utility;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VendorService {

    @Value("${api_url}")
    private String apiurl;

    @Value("${token_uri}")
    private String token;

    @Autowired
    BbookEnviaVendorRepository updsdirepository;

    private static final Logger LOG = LoggerFactory.getLogger(VendorService.class);

    public void EnvioVendors(List<BbookEnviaVendor> bbookvendor, String tipo) {

        Gson g = new Gson();
        JsonCab jsoncab = null;
        List<JsonDet> json = new ArrayList<>();
        HttpEntity<String> entity = null;

        try{

            for (BbookEnviaVendor row : bbookvendor) {

                json.add(new JsonDet(String.valueOf(row.getVendorId()), row.getVendorName(), row.getInactive(), row.getCountry(), row.getAddress1(), row.getAddress2(), row.getCity(),
                                     String.valueOf(row.getAreaCode()), row.getPhone(), row.getEmail(), row.getContactName(), row.getPaymentTerms(), String.valueOf(row.getEffectiveDays()),
                                     row.getCountry()));
            }

            jsoncab = new JsonCab(json);

            HttpHeaders headers = new HttpHeaders();
            headers.set("user-agent", "Application");

            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("X-Bbook-Token", token);

            entity = new HttpEntity<String>(g.toJson(jsoncab), headers);

        }catch (Exception e) {

            LOG.error("Error al cargar json", e);

        }

        String responses = null;

        try {

            responses = Utility.BulkUpdateApiPoster(entity, apiurl, tipo);

        }catch (Exception e) {

            LOG.error("Error al enviar datos", e);

            responses = "No se pudo informar Proveedor";
        }

        for (BbookEnviaVendor row : bbookvendor) {
            updsdirepository.updSdiSdivpcmst(row.getId());
        }
    }
}
