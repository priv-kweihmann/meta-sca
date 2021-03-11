SUMMARY = "RubyGem: aws-sdk-apigateway"
DESCRIPTION = "Official AWS Ruby gem for Amazon API Gateway"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "17f5f2cf083a9291c2349ea85ac2da5e"
SRC_URI[sha256sum] = "dcae182787d971479fa5380efd84ec5054939be5d78b4d9952092dee71d3be7a"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
