SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ec1888252f8a101aa1f41e86854b6995"
SRC_URI[sha256sum] = "9f6c5a3b2b1ee2660e1bf3ce40f425c16c9501bcb482c4519b8406374f5c8927"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
