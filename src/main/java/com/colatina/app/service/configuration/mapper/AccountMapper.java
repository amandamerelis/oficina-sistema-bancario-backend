package com.colatina.app.service.configuration.mapper;

import com.colatina.app.service.core.domain.AccountDomain;
import com.colatina.app.service.dataprovider.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper extends EntityMapper<AccountDomain, AccountEntity> {

}
