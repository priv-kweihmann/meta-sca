SUMMARY = "RubyGem: aws-sdk-apigateway"
DESCRIPTION = "Official AWS Ruby gem for Amazon API Gateway"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ff852b992b85f21a532eb270bb314331"
SRC_URI[sha256sum] = "0f24c2a008e1f57750299cc8c396af69b8f858bf4796810e0b6c93d75b5e388d"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
