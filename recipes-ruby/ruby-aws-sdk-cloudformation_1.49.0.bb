SUMMARY = "RubyGem: aws-sdk-cloudformation"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudFormation"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "beb2ff03f7bcad53b43d6e512d3343ae"
SRC_URI[sha256sum] = "e437f70a825a439c68d54d787c3bfb42773d7da049b711424ec1d53749389fda"

GEM_NAME = "aws-sdk-cloudformation"

inherit rubygems
