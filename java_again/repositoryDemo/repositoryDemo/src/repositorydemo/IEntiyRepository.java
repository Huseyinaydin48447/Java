/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorydemo;

public interface IEntiyRepository<T extends  IEntity> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);

}
