SUMMARY = "RubyGem: aws-sdk-transfer"
DESCRIPTION = "Official AWS Ruby gem for AWS Transfer Family (AWS Transfer)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3bd20e48a00afd29cb68285e39e4c36a"
SRC_URI[sha256sum] = "5d989bc2d914498c300d615d6d79a1c5eb63c1478dc38e5dc658a67e4230eaec"

GEM_NAME = "aws-sdk-transfer"

inherit rubygems
