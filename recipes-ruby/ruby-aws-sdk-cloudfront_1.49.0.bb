SUMMARY = "RubyGem: aws-sdk-cloudfront"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudFront (CloudFront)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3f8bef7db92b73b116106aa0ea4b3638"
SRC_URI[sha256sum] = "ee5bb2bf72c71376988ae7b1467a3e65721c8318a3b884ef80d0711257c9a242"

GEM_NAME = "aws-sdk-cloudfront"

inherit rubygems
