SUMMARY = "RubyGem: aws-sigv4"
DESCRIPTION = "Amazon Web Services Signature Version 4 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-eventstream"

SRC_URI[md5sum] = "31f1b1fdf70e5f63a143a42b04747088"
SRC_URI[sha256sum] = "5cd54a4bf2ccc077d890e5a004e72961f21672d287fbf3ee9cdfdd3a62853fb5"

GEM_NAME = "aws-sigv4"

inherit rubygems
