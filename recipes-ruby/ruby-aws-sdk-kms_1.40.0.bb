SUMMARY = "RubyGem: aws-sdk-kms"
DESCRIPTION = "Official AWS Ruby gem for AWS Key Management Service (KMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "038df7cc87bbf6350228f7824d362473"
SRC_URI[sha256sum] = "e4893e27f1e301dce7356a94c85cb675ad2c64b812011675808dfcc4033767de"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
