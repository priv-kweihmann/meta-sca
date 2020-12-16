SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e2d1df7fe391cf947b1e225826c30e96"
SRC_URI[sha256sum] = "ee5356e001419daa22d8cd04a6e5bcb55f995308076ed9625f90e8384572dc11"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
