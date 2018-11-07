package com.warems.warehouse.dao;

import com.warems.warehouse.entity.FoodRemainder;

import java.util.List;

public interface FoodRemainderDao
{
    public void update(FoodRemainder f);
    public FoodRemainder getOne(FoodRemainder f);
    public List<FoodRemainder> getAll();

}
