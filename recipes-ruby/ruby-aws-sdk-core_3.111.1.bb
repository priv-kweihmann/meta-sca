SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-eventstream \
                  ruby-aws-partitions \
                  ruby-aws-sigv4 \
                  ruby-jmespath"

SRC_URI[md5sum] = "8a554236dfea18ce722b9f9289b0fcd4"
SRC_URI[sha256sum] = "c86905e11fbbb75d439dbeb4c0a3111e48694c54db98829b2a5f0f81b398468d"

GEM_NAME = "aws-sdk-core"

inherit rubygems
