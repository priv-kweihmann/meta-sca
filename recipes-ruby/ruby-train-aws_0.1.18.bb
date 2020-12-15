SUMMARY = "RubyGem: train-aws"
DESCRIPTION = "Allows applications using Train to speak to AWS; handles authentication, cacheing, and SDK dependency management."
HOMEPAGE = "https://github.com/inspec/train-aws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f16f9b4dd2d3afd4d244ba4e5d9e715e"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-apigateway \
                  ruby-aws-sdk-apigatewayv2 \
                  ruby-aws-sdk-athena \
                  ruby-aws-sdk-autoscaling \
                  ruby-aws-sdk-budgets \
                  ruby-aws-sdk-cloudformation \
                  ruby-aws-sdk-cloudfront \
                  ruby-aws-sdk-cloudhsm \
                  ruby-aws-sdk-cloudhsmv2 \
                  ruby-aws-sdk-cloudtrail \
                  ruby-aws-sdk-cloudwatch \
                  ruby-aws-sdk-cloudwatchlogs \
                  ruby-aws-sdk-codecommit \
                  ruby-aws-sdk-codedeploy \
                  ruby-aws-sdk-codepipeline \
                  ruby-aws-sdk-configservice \
                  ruby-aws-sdk-core \
                  ruby-aws-sdk-costandusagereportservice \
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
                  ruby-aws-sdk-guardduty \
                  ruby-aws-sdk-iam \
                  ruby-aws-sdk-kafka \
                  ruby-aws-sdk-kinesis \
                  ruby-aws-sdk-kms \
                  ruby-aws-sdk-lambda \
                  ruby-aws-sdk-organizations \
                  ruby-aws-sdk-rds \
                  ruby-aws-sdk-redshift \
                  ruby-aws-sdk-route53 \
                  ruby-aws-sdk-route53domains \
                  ruby-aws-sdk-route53resolver \
                  ruby-aws-sdk-s3 \
                  ruby-aws-sdk-securityhub \
                  ruby-aws-sdk-ses \
                  ruby-aws-sdk-sms \
                  ruby-aws-sdk-sns \
                  ruby-aws-sdk-sqs \
                  ruby-aws-sdk-ssm"

SRC_URI[md5sum] = "fba6d82cda94888b2bae07603175d7be"
SRC_URI[sha256sum] = "99784fe7fd902a501ba730912a8f413d70d338d2a5e1bf4f3beeae744778afcb"

GEM_NAME = "train-aws"

inherit rubygems
