/**
 * This file is hereby placed into the Public Domain. This means anyone is
 * free to do whatever they wish with this file.
 */
package mil.nga.giat.data.elasticsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.elasticsearch.index.query.QueryBuilder;

public class ElasticRequest {

    private QueryBuilder query;

    private Map<String,Map<String,Map<String,Object>>> aggregations;

    private Integer size;

    private Integer from;

    private Integer scroll;

    private List<Map<String,String>> sorts;

    private List<String> sourceIncludes;

    private List<String> fields;

    public ElasticRequest() {
        this.sorts = new ArrayList<>();
        this.fields = new ArrayList<>();
        this.sourceIncludes = new ArrayList<>();
    }

    public QueryBuilder getQuery() {
        return query;
    }

    public void setQuery(QueryBuilder query) {
        this.query = query;
    }

    public Map<String,Map<String,Map<String,Object>>> getAggregations() {
        return aggregations;
    }

    public void setAggregations(Map<String,Map<String,Map<String,Object>>> aggregations) {
        this.aggregations = aggregations;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getScroll() {
        return scroll;
    }

    public void setScroll(Integer scroll) {
        this.scroll = scroll;
    }

    public List<Map<String, String>> getSorts() {
        return sorts;
    }

    public void addSort(String key, String order) {
        this.sorts.add(Collections.singletonMap(key, order));
    }

    public List<String> getSourceIncludes() {
        return sourceIncludes;
    }

    public void addSourceInclude(String sourceInclude) {
        this.sourceIncludes.add(sourceInclude);
    }

    public List<String> getFields() {
        return fields;
    }

    public void addField(String field) {
        this.fields.add(field);
    }

}
