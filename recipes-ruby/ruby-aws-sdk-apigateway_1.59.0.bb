SUMMARY = "RubyGem: aws-sdk-apigateway"
DESCRIPTION = "Official AWS Ruby gem for Amazon API Gateway"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "694551127a88c5b650e7a50b72c5caa9"
SRC_URI[sha256sum] = "75bfb398c28d41362fb94498fb6ef4a571cc0b0cfd4661afc33d6c1494a97c97"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
