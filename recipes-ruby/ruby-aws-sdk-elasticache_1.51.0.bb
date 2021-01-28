SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "878be4dd28d4d63022615327efa65841"
SRC_URI[sha256sum] = "235ba15636a783ce107523d4406014556ac819103750ade978eb751be86f4ec7"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
