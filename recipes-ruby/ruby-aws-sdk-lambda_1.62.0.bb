SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b5a2eb84f8797e949abc19ec3029094d"
SRC_URI[sha256sum] = "e55137d18c6b58ca60451c91320b37f58d4ff48892e0961c5ff493b44aceac65"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
