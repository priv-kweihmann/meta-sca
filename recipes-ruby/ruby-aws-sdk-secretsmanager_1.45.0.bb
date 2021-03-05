SUMMARY = "RubyGem: aws-sdk-secretsmanager"
DESCRIPTION = "Official AWS Ruby gem for AWS Secrets Manager"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "bb8c98f0451ef5394d5d40d689f8db9b"
SRC_URI[sha256sum] = "01af1973d83b34f31061f2e3e432437021185a406b67869ef6ff5a55c9ba36ec"

GEM_NAME = "aws-sdk-secretsmanager"

inherit rubygems
