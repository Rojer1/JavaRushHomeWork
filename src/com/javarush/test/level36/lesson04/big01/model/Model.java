package com.javarush.test.level36.lesson04.big01.model;

/**
 * Используя любую модель должна быть возможность получить все необходимые данные для отображения
 */
public interface Model {

    ModelData getModelData();

    void loadUsers();
}