SUMMARY = "RubyGem: aws-sdk-cloudformation"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudFormation"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "978854a191a7eaaa1ecab155976216f3"
SRC_URI[sha256sum] = "e7fa6bcaa568290bfaf51d06d9c54a250584383494d3a21ac7b0a35d2bf3a6e3"

GEM_NAME = "aws-sdk-cloudformation"

inherit rubygems
