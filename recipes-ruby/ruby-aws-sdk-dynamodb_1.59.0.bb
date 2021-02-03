SUMMARY = "RubyGem: aws-sdk-dynamodb"
DESCRIPTION = "Official AWS Ruby gem for Amazon DynamoDB (DynamoDB)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "07d86dc59a980df868092bbb40caead8"
SRC_URI[sha256sum] = "38103f97b1403f50aa4a301ad73ca228b1406aacbfc4921a7e9c5bfaec8f63a6"

GEM_NAME = "aws-sdk-dynamodb"

inherit rubygems
