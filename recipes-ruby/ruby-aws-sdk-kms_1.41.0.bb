SUMMARY = "RubyGem: aws-sdk-kms"
DESCRIPTION = "Official AWS Ruby gem for AWS Key Management Service (KMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a29d7bbd8969a61782775fcc8454a04c"
SRC_URI[sha256sum] = "95ff57eac7bb75efb3de2ad0f64bc22e96608753506e658fb202969c8902c709"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
