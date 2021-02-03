SUMMARY = "RubyGem: aws-sdk-sns"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Notification Service (Amazon SNS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d80f5f441816f8932c8243e9d9fd9e28"
SRC_URI[sha256sum] = "cba925691dd51cfa42d9cb7fae9278ffa7e3ab05efa97515edacba1749881933"

GEM_NAME = "aws-sdk-sns"

inherit rubygems
