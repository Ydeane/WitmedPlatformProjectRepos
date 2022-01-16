package com.yrx.witmedPlatform.base.util;

import com.yrx.witmedPlatform.entity.system.admin.Admin;
import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-14T16:22:45+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
@Component
public class PojoMapperImpl implements PojoMapper {

    @Override
    public AdminVO parseToVO(Admin admin) {
        if ( admin == null ) {
            return null;
        }

        AdminVO adminVO = new AdminVO();

        adminVO.setStatus( admin.getStatus() );
        adminVO.setCreatedTime( admin.getCreatedTime() );
        adminVO.setModifiedBy( admin.getModifiedBy() );
        adminVO.setModifiedTime( admin.getModifiedTime() );
        adminVO.setId( admin.getId() );
        adminVO.setNo( admin.getNo() );
        adminVO.setName( admin.getName() );
        adminVO.setCellphone( admin.getCellphone() );
        adminVO.setPassword( admin.getPassword() );

        return adminVO;
    }
}
