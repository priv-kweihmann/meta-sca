SUMMARY = "RubyGem: aws-sdk-apigatewayv2"
DESCRIPTION = "Official AWS Ruby gem for AmazonApiGatewayV2"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a10d036a68d0105d28dcef8c81f86087"
SRC_URI[sha256sum] = "b7b7173c2a66e02283d88a594c48a5c7dcb5520f9f7d906ce654241d5f2f4671"

GEM_NAME = "aws-sdk-apigatewayv2"

inherit rubygems
