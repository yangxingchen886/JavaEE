package club.banyuan.blog.mapper;

import java.util.List;

import club.banyuan.blog.entity.RoleEntity;

public interface RoleMapper {

  List<RoleEntity> getRolesByUid(Long uid);
}
