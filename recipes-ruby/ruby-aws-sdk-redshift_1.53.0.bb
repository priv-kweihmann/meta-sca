SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ec3e9fd64d0c8e93391d9493e8c5e732"
SRC_URI[sha256sum] = "ce5694054b861e15b110d3dd0dac4e11a3b18054a1d563ae178e15d9daaf36f9"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
