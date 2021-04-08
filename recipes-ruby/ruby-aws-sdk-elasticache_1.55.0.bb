SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7c439b3963d8c549ab0a96d385063288"
SRC_URI[sha256sum] = "28d95966312711360ea413f37762e4d2754ce1535584a7debd59b0bd42175cc8"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
