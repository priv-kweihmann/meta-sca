SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "58e7e21788aea910860b1add8c308889"
SRC_URI[sha256sum] = "de202be1ea4a2de64c146edd1935197ebc419028edace8616e6c8233db0e7cb9"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
