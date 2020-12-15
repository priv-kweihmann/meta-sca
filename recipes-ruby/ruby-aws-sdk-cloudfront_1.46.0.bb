SUMMARY = "RubyGem: aws-sdk-cloudfront"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudFront (CloudFront)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a044cb8332f1224c86f1f6c1275242f5"
SRC_URI[sha256sum] = "d895ebdf435dbc6f265eecb8d42fda103c02d31c8c03351f0d1b487fdc8302ec"

GEM_NAME = "aws-sdk-cloudfront"

inherit rubygems
