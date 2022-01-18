package com.yrx.witmedPlatform.entity.system.admin.util;

import com.yrx.witmedPlatform.entity.system.admin.pojo.Admin;
import com.yrx.witmedPlatform.entity.system.admin.pojo.Menu;
import com.yrx.witmedPlatform.system.admin.pojo.vo.AdminVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.MenuVO;
import com.yrx.witmedPlatform.system.admin.pojo.vo.Meta;
import com.yrx.witmedPlatform.system.admin.pojo.vo.RoleVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T12:33:28+0800",
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

        adminVO.setRoleVO( adminToRoleVO( admin ) );
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

    @Override
    public MenuVO parseToVO(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        MenuVO menuVO = new MenuVO();

        menuVO.setMeta( menuToMeta( menu ) );
        menuVO.setStatus( menu.getStatus() );
        menuVO.setCreatedTime( menu.getCreatedTime() );
        menuVO.setModifiedBy( menu.getModifiedBy() );
        menuVO.setModifiedTime( menu.getModifiedTime() );
        menuVO.setName( menu.getName() );
        menuVO.setPath( menu.getPath() );
        menuVO.setComponent( menu.getComponent() );

        return menuVO;
    }

    @Override
    public List<MenuVO> parseToVOList(List<Menu> menuList) {
        if ( menuList == null ) {
            return null;
        }

        List<MenuVO> list = new ArrayList<MenuVO>( menuList.size() );
        for ( Menu menu : menuList ) {
            list.add( parseToVO( menu ) );
        }

        return list;
    }

    protected RoleVO adminToRoleVO(Admin admin) {
        if ( admin == null ) {
            return null;
        }

        RoleVO roleVO = new RoleVO();

        roleVO.setCode( admin.getRole() );

        return roleVO;
    }

    protected Meta menuToMeta(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        Meta meta = new Meta();

        meta.setTitle( menu.getTitle() );
        meta.setIcon( menu.getIcon() );

        return meta;
    }
}
