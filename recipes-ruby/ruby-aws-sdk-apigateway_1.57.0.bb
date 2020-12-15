SUMMARY = "RubyGem: aws-sdk-apigateway"
DESCRIPTION = "Official AWS Ruby gem for Amazon API Gateway"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1b3483bb6130f6053bafc81e4b2fd605"
SRC_URI[sha256sum] = "e1e64f983c8e8aed3e004e9f12e0f813e8beba9d4b7ee9313822927ba0f13488"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
