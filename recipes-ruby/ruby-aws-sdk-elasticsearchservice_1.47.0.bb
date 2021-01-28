SUMMARY = "RubyGem: aws-sdk-elasticsearchservice"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elasticsearch Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "88add9d1d9b98738024c4706cb4dd502"
SRC_URI[sha256sum] = "c95755809a570e4db007c7da14bc588b51c23dfb4948d243d3038682ecc2e1e7"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
