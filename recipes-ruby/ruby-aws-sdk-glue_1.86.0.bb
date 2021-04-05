SUMMARY = "RubyGem: aws-sdk-glue"
DESCRIPTION = "Official AWS Ruby gem for AWS Glue"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "58eee74cdfb05e95661d0ca74423ff96"
SRC_URI[sha256sum] = "aa4fe6e1dd9786c9f2ed9ce5cabdf469d2749e16dd703c5d99b39149f3388cf4"

GEM_NAME = "aws-sdk-glue"

inherit rubygems
