SUMMARY = "RubyGem: aws-sdk-apigatewayv2"
DESCRIPTION = "Official AWS Ruby gem for AmazonApiGatewayV2"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1531b648ffe4ac93c22d929b43239b17"
SRC_URI[sha256sum] = "d9ed93d220c8c40eacae93f29c0ec5f651fed094ea930a9ac5f7a619ed109106"

GEM_NAME = "aws-sdk-apigatewayv2"

inherit rubygems
