//package com.example.demo.Pagination;
//
//import java.util.List;
//
//import org.springframework.beans.support.PagedListHolder;
//import org.springframework.data.domain.Pageable;
//
//public class PagingUtilities {
//  public static <E> PagedListHolder<E> getPagedList(List<E> list, Pageable pageRequest) {
//    PagedListHolder<E> pagedList = new PagedListHolder(list);
//    pagedList.setPage(pageRequest.getPageNumber());
//    pagedList.setPageSize(pageRequest.getPageSize());
//    return pagedList;
//  }
//}
