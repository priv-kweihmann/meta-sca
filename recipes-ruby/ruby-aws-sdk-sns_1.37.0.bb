SUMMARY = "RubyGem: aws-sdk-sns"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Notification Service (Amazon SNS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7962809b2328faea267f1e5bda0e8b99"
SRC_URI[sha256sum] = "5615eb42d04637bc62bc80d9791187c72e75dcdc339f27b471963b80151307e1"

GEM_NAME = "aws-sdk-sns"

inherit rubygems
