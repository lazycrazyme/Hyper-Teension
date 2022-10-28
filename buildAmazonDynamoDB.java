    public AmazonDynamoDB buildAmazonDynamoDB() {

        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(
                                awsEndPoint,awsRegion
                        )
                )
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(
                        awsAccessKey,awsSecretKey
                ))).build();
    }
