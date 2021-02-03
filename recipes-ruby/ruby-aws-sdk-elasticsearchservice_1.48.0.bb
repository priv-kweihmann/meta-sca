SUMMARY = "RubyGem: aws-sdk-elasticsearchservice"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elasticsearch Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "76eea260d9ae38d44eb26d4a4b4a71be"
SRC_URI[sha256sum] = "fe2fe2820919a5818889736134a4bc9e29be485fcf15b1ff00f7452ccfa5e98c"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
