Read

* https://blog.apollographql.com/scala-js-and-apollo-better-together-b066c6b09af4

* https://www.prisma.io/blog/introducing-graphql-nexus-code-first-graphql-server-development-ll6s1yy5cxl5

* https://www.prisma.io/blog/using-graphql-nexus-with-a-database-pmyl3660ncst

----

--> Database first

1. Multiple evolution sets which are dependent on database vendor.

2. Ability to infer the database vendor from JDBC URL and apply evolution set accordingly.

3. Slick code generator which create GraphQL schema from JDBC connection.

--> GraphQL Schema second

4. Slick code generator which generate Slick schema.

5. Slick code generator which generates all possible queries and mutations needed by a typical CRUD application.

6. Employ ``react-apollo-scalajs`` in order to generate ScalaJS from GraphQL schemas, queries and mutations.
   The GraphQL schema was obtained in step (3).
   Schemas and mutations were obtained in step (5).
   
