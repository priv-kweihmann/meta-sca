SUMMARY = "RubyGem: train-aws"
DESCRIPTION = "Allows applications using Train to speak to AWS; handles authentication, cacheing, and SDK dependency management."
HOMEPAGE = "https://github.com/inspec/train-aws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f16f9b4dd2d3afd4d244ba4e5d9e715e"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-apigateway \
                  ruby-aws-sdk-apigatewayv2 \
                  ruby-aws-sdk-applicationautoscaling \
                  ruby-aws-sdk-athena \
                  ruby-aws-sdk-autoscaling \
                  ruby-aws-sdk-batch \
                  ruby-aws-sdk-budgets \
                  ruby-aws-sdk-cloudformation \
                  ruby-aws-sdk-cloudfront \
                  ruby-aws-sdk-cloudhsm \
                  ruby-aws-sdk-cloudhsmv2 \
                  ruby-aws-sdk-cloudtrail \
                  ruby-aws-sdk-cloudwatch \
                  ruby-aws-sdk-cloudwatchevents \
                  ruby-aws-sdk-cloudwatchlogs \
                  ruby-aws-sdk-codecommit \
                  ruby-aws-sdk-codedeploy \
                  ruby-aws-sdk-codepipeline \
                  ruby-aws-sdk-cognitoidentity \
                  ruby-aws-sdk-cognitoidentityprovider \
                  ruby-aws-sdk-configservice \
                  ruby-aws-sdk-core \
                  ruby-aws-sdk-costandusagereportservice \
                  ruby-aws-sdk-databasemigrationservice \
                  ruby-aws-sdk-dynamodb \
                  ruby-aws-sdk-ec2 \
                  ruby-aws-sdk-ecr \
                  ruby-aws-sdk-ecs \
                  ruby-aws-sdk-efs \
                  ruby-aws-sdk-eks \
                  ruby-aws-sdk-elasticache \
                  ruby-aws-sdk-elasticbeanstalk \
                  ruby-aws-sdk-elasticloadbalancing \
                  ruby-aws-sdk-elasticloadbalancingv2 \
                  ruby-aws-sdk-elasticsearchservice \
                  ruby-aws-sdk-firehose \
                  ruby-aws-sdk-glue \
                  ruby-aws-sdk-guardduty \
                  ruby-aws-sdk-iam \
                  ruby-aws-sdk-kafka \
                  ruby-aws-sdk-kinesis \
                  ruby-aws-sdk-kms \
                  ruby-aws-sdk-lambda \
                  ruby-aws-sdk-organizations \
                  ruby-aws-sdk-ram \
                  ruby-aws-sdk-rds \
                  ruby-aws-sdk-redshift \
                  ruby-aws-sdk-route53 \
                  ruby-aws-sdk-route53domains \
                  ruby-aws-sdk-route53resolver \
                  ruby-aws-sdk-s3 \
                  ruby-aws-sdk-secretsmanager \
                  ruby-aws-sdk-securityhub \
                  ruby-aws-sdk-servicecatalog \
                  ruby-aws-sdk-ses \
                  ruby-aws-sdk-shield \
                  ruby-aws-sdk-sms \
                  ruby-aws-sdk-sns \
                  ruby-aws-sdk-sqs \
                  ruby-aws-sdk-ssm \
                  ruby-aws-sdk-states \
                  ruby-aws-sdk-transfer"

SRC_URI[md5sum] = "2f8217446eed0d1b880f84cf2c96cf14"
SRC_URI[sha256sum] = "cf91de6a9db4371bc80f9b422fec3539b3b4a0c63d4051cc7139f0f9e75b8c04"

GEM_NAME = "train-aws"

inherit rubygems
