SUMMARY = "RubyGem: aws-sdk-cloudwatchevents"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Events"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "470229668faabd16f07cfb5621a2e4d0"
SRC_URI[sha256sum] = "71f07a2b6eb83e20f8113310a6cb6e6f186733a7882c6afb1334895788164509"

GEM_NAME = "aws-sdk-cloudwatchevents"

inherit rubygems
