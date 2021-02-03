SUMMARY = "RubyGem: aws-sdk-kms"
DESCRIPTION = "Official AWS Ruby gem for AWS Key Management Service (KMS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "264e07412ed19f720dfa39f55a946055"
SRC_URI[sha256sum] = "31e0cb176db2bf7116faa0c37062a3deb518b1028d022fd639dff8c606728f03"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
