SUMMARY = "RubyGem: aws-sdk-ssm"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Systems Manager (SSM) (Amazon SSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9f58008745e3b177fcd96724c932b167"
SRC_URI[sha256sum] = "3593867cbd9e172f6dfb42109bad84c4ebfbda4e733f360267b8bd5971870c55"

GEM_NAME = "aws-sdk-ssm"

inherit rubygems
