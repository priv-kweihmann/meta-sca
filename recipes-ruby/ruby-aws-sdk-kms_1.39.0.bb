SUMMARY = "RubyGem: aws-sdk-kms"
DESCRIPTION = "Official AWS Ruby gem for AWS Key Management Service (KMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fdee0bcf810f299ee2123c8c4a7b60f5"
SRC_URI[sha256sum] = "2a512b6518bbb9fdf336dcbca15e497fcbcf5efe4b7b7d5c8c4c541c86a9c153"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
