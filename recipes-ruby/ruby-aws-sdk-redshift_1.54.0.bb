SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ebb03a69531721ab56c5017159df20ec"
SRC_URI[sha256sum] = "8fcc5ee6b77b526dba715e3de96b8a4199d68b15a695ad6fdc4c30bfcb8ba4b8"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
