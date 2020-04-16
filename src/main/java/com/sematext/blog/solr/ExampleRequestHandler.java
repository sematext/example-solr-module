package com.sematext.blog.solr;

import org.apache.solr.common.util.NamedList;
import org.apache.solr.core.PluginInfo;
import org.apache.solr.handler.component.SearchHandler;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.response.SolrQueryResponse;

/**
 * An example search handler.
 */
public class ExampleRequestHandler extends SearchHandler {
  @Override
  public void init(NamedList args) {
    super.init(args);
  }

  @Override
  public void init(PluginInfo info) {
    super.init(info);
  }

  @Override
  public void handleRequestBody(SolrQueryRequest req, SolrQueryResponse rsp) throws Exception {
    super.handleRequestBody(req, rsp);
  }
}
