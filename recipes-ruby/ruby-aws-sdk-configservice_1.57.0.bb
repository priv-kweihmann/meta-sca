SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e45d0adc0930d11a57579ef6111fdd81"
SRC_URI[sha256sum] = "69b38fe03fc56a037e8ada679a002cc35830154274f15ce1e42c999f7a3f115f"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
