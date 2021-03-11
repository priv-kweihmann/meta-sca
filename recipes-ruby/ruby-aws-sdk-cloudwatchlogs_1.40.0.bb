SUMMARY = "RubyGem: aws-sdk-cloudwatchlogs"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Logs"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3b990d82fbaa3ede466a33736f1ede53"
SRC_URI[sha256sum] = "5ad557789318977a91193618e8d37c2ab964b02515b8059bb518467b5e9de63c"

GEM_NAME = "aws-sdk-cloudwatchlogs"

inherit rubygems
