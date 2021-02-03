SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "56d0ea8784d62961aa75f10f77311f36"
SRC_URI[sha256sum] = "c5d03dfbc757565d5b0ed6c0075d0e2f9cc27fe025d7b04777c4ce2493e138d8"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
