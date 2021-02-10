SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fd8d9d057250a6eac745d71efdfc10f3"
SRC_URI[sha256sum] = "e5987bf67e273dc319ac2416be8c73de9d67764934f76f0b1e245d15acb0f7cd"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
