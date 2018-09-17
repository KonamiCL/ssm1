package main.java.cap.service

import cap.model.Admin
import cap.util.PageBean

interface AdminService {
    fun selectById(id: Int?): Admin

    fun selectAll(): List<Admin>

    fun addAdmin(admin: Admin): Int

    fun updateAdmin(admin: Admin): Int

    fun deleteAdmin(id: Int?): Int

    fun findByPage(pageNo: Int, pageSize: Int): PageBean

}