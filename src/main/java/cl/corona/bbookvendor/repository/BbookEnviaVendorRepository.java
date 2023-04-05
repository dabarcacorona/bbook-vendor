package cl.corona.bbookvendor.repository;

import cl.corona.bbookvendor.model.BbookEnviaVendor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BbookEnviaVendorRepository extends CrudRepository<BbookEnviaVendor, String> {

    public List<BbookEnviaVendor> findAllByTranType(String tranType);

    @Modifying(clearAutomatically = true)
    @Query(value = "update app_sam.sdi_sdivpcmst s set s.download_date_1 = sysdate where rowid = :id", nativeQuery = true)
    public void updSdiSdivpcmst(@Param("id") String id);
}
