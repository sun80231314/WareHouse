package com.warems.warehouse.dao;

import com.warems.warehouse.entity.Check;

import java.util.List;

public interface CheckDao {
    public void add(Check c);
    public void delete(Check c);
    public void update(Check c);
    public Check getOne(Check c);
    public List<Check> getAll();
    public  void updateUsed(Check c);
}
