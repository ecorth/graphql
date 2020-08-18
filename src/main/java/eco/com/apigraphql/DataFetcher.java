package eco.com.apigraphql;


import graphql.schema.DataFetchingEnvironment;

public interface DataFetcher<T> {
    T get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception;
}

