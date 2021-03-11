SUMMARY = "RubyGem: aws-sdk-cognitoidentityprovider"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity Provider"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "92e150281bdff63ac47ed9a8465a6c5b"
SRC_URI[sha256sum] = "aa6ef890c60e825acc3d4a0e79c089ac2b8113a4fcf0c61f4a1fa6d28b6fa1dc"

GEM_NAME = "aws-sdk-cognitoidentityprovider"

inherit rubygems
