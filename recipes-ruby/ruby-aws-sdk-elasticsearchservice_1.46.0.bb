SUMMARY = "RubyGem: aws-sdk-elasticsearchservice"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elasticsearch Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "34fd98491ebac021e41b22ad3d0f2d2d"
SRC_URI[sha256sum] = "1a0f0b043a79475b8f25f6a2e99c4aff71717cbdcefd89f52142744290609e81"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
