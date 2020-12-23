SUMMARY = "RubyGem: aws-sdk-apigateway"
DESCRIPTION = "Official AWS Ruby gem for Amazon API Gateway"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "518bb1c9c6c2f9a70dbad6e1b2179e85"
SRC_URI[sha256sum] = "0bae6389eb21aa5f50049e1bd5bac95ae198c38ed0c356b000eb5f1d98e4415c"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
