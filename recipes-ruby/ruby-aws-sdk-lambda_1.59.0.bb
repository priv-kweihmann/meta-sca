SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8a7c9d78b38429a8db3a6358386796be"
SRC_URI[sha256sum] = "e3d81141d6b2d84456a3e5d1f92f82246cd4bc4eb0b8c39ee48797892e6edb95"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
