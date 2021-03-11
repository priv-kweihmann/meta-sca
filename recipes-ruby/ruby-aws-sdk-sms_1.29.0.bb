SUMMARY = "RubyGem: aws-sdk-sms"
DESCRIPTION = "Official AWS Ruby gem for AWS Server Migration Service (SMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7516f88fec2950a5213e2ba0295a8e87"
SRC_URI[sha256sum] = "f6c12c1a8c0805d09e40e4024e71813e21b8d94496ecec18f9e7cec2ecee0dcf"

GEM_NAME = "aws-sdk-sms"

inherit rubygems
