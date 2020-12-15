SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e90f486f928cccac919e4b4969ec4094"
SRC_URI[sha256sum] = "2db692bcbb8dd1e1603b5bc892e56cfa73e8c93be85696070e114178ffb75ebb"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
