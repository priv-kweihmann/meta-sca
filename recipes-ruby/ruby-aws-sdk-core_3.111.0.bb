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

SRC_URI[md5sum] = "5105944fc76672c0b47937b51409ad0e"
SRC_URI[sha256sum] = "68ba5613d5974ac5950fe956ede183fe0041fdf0d878208ce96c77e2c9c2c669"

GEM_NAME = "aws-sdk-core"

inherit rubygems
