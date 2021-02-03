SUMMARY = "RubyGem: aws-sdk-cloudfront"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudFront (CloudFront)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f8ad06bbb22f234435249ec9fd4b8422"
SRC_URI[sha256sum] = "66dd6d3b931f605e97315397b757efe03396a54302617f79b968b1b2396ae0f0"

GEM_NAME = "aws-sdk-cloudfront"

inherit rubygems
