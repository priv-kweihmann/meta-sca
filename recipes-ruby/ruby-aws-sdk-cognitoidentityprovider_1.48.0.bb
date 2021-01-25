SUMMARY = "RubyGem: aws-sdk-cognitoidentityprovider"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity Provider"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "00ad170c5dd31c95ef583ee171d4f0bb"
SRC_URI[sha256sum] = "b66283c7fe57c9afdcaeb2e2728f43596f337ae30d7d3d73823b00ee796f0954"

GEM_NAME = "aws-sdk-cognitoidentityprovider"

inherit rubygems
