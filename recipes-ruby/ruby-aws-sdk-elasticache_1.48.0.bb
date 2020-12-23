SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "220e99813f5f39ba1afe363ad4af72a0"
SRC_URI[sha256sum] = "ef59335520faf3efe11a97efa5c3c31f33e0b24bf3409c5dedba0d7ee9ef87e7"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
