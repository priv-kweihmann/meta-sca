SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "59622a0672e644a967f882f32d99c5a7"
SRC_URI[sha256sum] = "346f54a2d8e6d107fcb44fdecf944f3f831539d609c92036f574865e6a63e18c"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
