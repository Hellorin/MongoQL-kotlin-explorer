package ch.hellorin.graphqlmongoexplorer.configuration

import ch.hellorin.graphqlmongoexplorer.MongoPersonDao
import ch.hellorin.graphqlmongoexplorer.QueryResolver
import com.coxautodev.graphql.tools.SchemaParser
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GraphQLConfiguration {

    @Bean
    fun schema(
            dao: MongoPersonDao
    ): SchemaParser = SchemaParser.newParser()
            .files(
                    "graphql/query.graphqls",
                    "graphql/types.graphqls"
            ).resolvers(QueryResolver(dao)).build()
}