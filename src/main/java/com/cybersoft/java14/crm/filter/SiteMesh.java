package com.cybersoft.java14.crm.filter;

import javax.servlet.annotation.WebFilter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

@WebFilter(filterName = "siteMesh", urlPatterns = "/")
public class SiteMesh extends SiteMeshFilter {

}
