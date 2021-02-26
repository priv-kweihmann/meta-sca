SUMMARY = "RubyGem: aws-sdk-transfer"
DESCRIPTION = "Official AWS Ruby gem for AWS Transfer Family (AWS Transfer)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3d8a308e6b0716650e3923c0a9f9312d"
SRC_URI[sha256sum] = "bc1194c410d74a3bc22f4ebe311cd03fca0c451f63d2f7eeccb3803456ef2e27"

GEM_NAME = "aws-sdk-transfer"

inherit rubygems
