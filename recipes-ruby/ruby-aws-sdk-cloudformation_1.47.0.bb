SUMMARY = "RubyGem: aws-sdk-cloudformation"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudFormation"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7d52125d40f3ca4d7dcc5ffeea6861d9"
SRC_URI[sha256sum] = "fc99105cd2b7913a248787f9e5743738fbb7165b555ae4f9eea793781fc28c26"

GEM_NAME = "aws-sdk-cloudformation"

inherit rubygems
