SUMMARY = "RubyGem: aws-sdk-apigatewayv2"
DESCRIPTION = "Official AWS Ruby gem for AmazonApiGatewayV2"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9d6f602f8148d17d3c5c1728ecdd4836"
SRC_URI[sha256sum] = "87e5e368c0a3ff5866bf03432a2494c4857f73227bc78c6d98d0c0f26c073b9c"

GEM_NAME = "aws-sdk-apigatewayv2"

inherit rubygems
