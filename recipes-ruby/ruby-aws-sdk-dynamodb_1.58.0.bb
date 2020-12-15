SUMMARY = "RubyGem: aws-sdk-dynamodb"
DESCRIPTION = "Official AWS Ruby gem for Amazon DynamoDB (DynamoDB)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "47dae35f09cff8ebbe4a0f384c3761e8"
SRC_URI[sha256sum] = "2bb19cebbe13708cabec3bb00116ed10b27add49396b122c38a45be68ecf0e10"

GEM_NAME = "aws-sdk-dynamodb"

inherit rubygems
