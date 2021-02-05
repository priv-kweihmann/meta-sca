SUMMARY = "RubyGem: aws-sdk-athena"
DESCRIPTION = "Official AWS Ruby gem for Amazon Athena"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "bbaa148def8bf6eb39a26cb326c0f5c3"
SRC_URI[sha256sum] = "76b50a89e4a72a3be05f6e30a9208ab53c93247ae50b1cc2983783612564ab52"

GEM_NAME = "aws-sdk-athena"

inherit rubygems
