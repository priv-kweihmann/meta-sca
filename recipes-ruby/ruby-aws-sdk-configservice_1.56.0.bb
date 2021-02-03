SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "0bdbee6b71bf626d5237b73dca28cac8"
SRC_URI[sha256sum] = "de550cba9a712f318a4cce1d301d96abf9b5c5659236279caac9277c5f784dd7"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
