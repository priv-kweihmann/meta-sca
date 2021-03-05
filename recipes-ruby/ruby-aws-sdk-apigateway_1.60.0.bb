SUMMARY = "RubyGem: aws-sdk-apigateway"
DESCRIPTION = "Official AWS Ruby gem for Amazon API Gateway"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2dd6fc4be24d4bbf408592f584028031"
SRC_URI[sha256sum] = "c74a74e3a7b9b2d3db872dca694c3a2186f2952544055c87c06fb6a67676b468"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
