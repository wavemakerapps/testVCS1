/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testvcs1.sales.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testvcs1.sales.AccountManager;


/**
 * ServiceImpl object for domain model class AccountManager.
 *
 * @see AccountManager
 */
@Service("sales.AccountManagerService")
@Validated
public class AccountManagerServiceImpl implements AccountManagerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountManagerServiceImpl.class);


    @Autowired
    @Qualifier("sales.AccountManagerDao")
    private WMGenericDao<AccountManager, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<AccountManager, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public AccountManager create(AccountManager accountManager) {
        LOGGER.debug("Creating a new AccountManager with information: {}", accountManager);

        AccountManager accountManagerCreated = this.wmGenericDao.create(accountManager);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(accountManagerCreated);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public AccountManager getById(Integer accountmanagerId) {
        LOGGER.debug("Finding AccountManager by id: {}", accountmanagerId);
        return this.wmGenericDao.findById(accountmanagerId);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public AccountManager findById(Integer accountmanagerId) {
        LOGGER.debug("Finding AccountManager by id: {}", accountmanagerId);
        try {
            return this.wmGenericDao.findById(accountmanagerId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No AccountManager found with id: {}", accountmanagerId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public List<AccountManager> findByMultipleIds(List<Integer> accountmanagerIds, boolean orderedReturn) {
        LOGGER.debug("Finding AccountManagers by ids: {}", accountmanagerIds);

        return this.wmGenericDao.findByMultipleIds(accountmanagerIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "salesTransactionManager")
    @Override
    public AccountManager update(AccountManager accountManager) {
        LOGGER.debug("Updating AccountManager with information: {}", accountManager);

        this.wmGenericDao.update(accountManager);
        this.wmGenericDao.refresh(accountManager);

        return accountManager;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public AccountManager delete(Integer accountmanagerId) {
        LOGGER.debug("Deleting AccountManager with id: {}", accountmanagerId);
        AccountManager deleted = this.wmGenericDao.findById(accountmanagerId);
        if (deleted == null) {
            LOGGER.debug("No AccountManager found with id: {}", accountmanagerId);
            throw new EntityNotFoundException(String.valueOf(accountmanagerId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public void delete(AccountManager accountManager) {
        LOGGER.debug("Deleting AccountManager with {}", accountManager);
        this.wmGenericDao.delete(accountManager);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<AccountManager> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all AccountManagers");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<AccountManager> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all AccountManagers");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service sales for table AccountManager to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service sales for table AccountManager to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}