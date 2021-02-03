SUMMARY = "RubyGem: aws-sdk-cognitoidentityprovider"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity Provider"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "64cdb40c79dfc1a2e857178ba88b40b5"
SRC_URI[sha256sum] = "54f96be46b12a9d08becf577148d72eef0e9c9f351e9734e0d967b852da7579a"

GEM_NAME = "aws-sdk-cognitoidentityprovider"

inherit rubygems
