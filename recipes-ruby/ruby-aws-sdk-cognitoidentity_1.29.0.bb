SUMMARY = "RubyGem: aws-sdk-cognitoidentity"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ffa45d715cb6a418eb7032f6b7159211"
SRC_URI[sha256sum] = "6bd4a0d8d5fc629acb9e96af0dafffc1fcc8d505ebcf40cac38a3120c61b5188"

GEM_NAME = "aws-sdk-cognitoidentity"

inherit rubygems
