SUMMARY = "RubyGem: aws-sdk-apigatewayv2"
DESCRIPTION = "Official AWS Ruby gem for AmazonApiGatewayV2"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "82e65f9d813c8e731d9410625864c984"
SRC_URI[sha256sum] = "fa5a3f1e650da05f0e56ecb6d4495923c961962d9f3e0f13451ab5fccb17a172"

GEM_NAME = "aws-sdk-apigatewayv2"

inherit rubygems
