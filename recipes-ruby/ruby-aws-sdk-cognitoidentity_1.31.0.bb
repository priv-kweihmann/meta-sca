SUMMARY = "RubyGem: aws-sdk-cognitoidentity"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "71a405c550f889fe29812d2c7046b0a2"
SRC_URI[sha256sum] = "02cf80f09e969eb1cc5c8cb3a4c7918910ab45b308da4149ec737e166326ed4c"

GEM_NAME = "aws-sdk-cognitoidentity"

inherit rubygems
