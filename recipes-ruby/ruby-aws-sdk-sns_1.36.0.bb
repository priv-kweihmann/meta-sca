SUMMARY = "RubyGem: aws-sdk-sns"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Notification Service (Amazon SNS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9e8cd26a649da1c0f95179ddbc87406a"
SRC_URI[sha256sum] = "b1a2d38e8fe49cfff05fe23bff57321b5d3ea0c3493181e9755509464db69513"

GEM_NAME = "aws-sdk-sns"

inherit rubygems
