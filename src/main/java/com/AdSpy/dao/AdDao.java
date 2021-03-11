package com.AdSpy.dao;

import com.AdSpy.entity.Advertisement;

import java.util.List;

public interface AdDao {

    public List<Advertisement>findAll();

    public Advertisement findAdByCreatorId(int creatorId);
}
