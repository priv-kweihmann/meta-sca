SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7b533aae1921a2266e94080c3939d6a4"
SRC_URI[sha256sum] = "984a3e69d5e7545aab91b6eb37f879f15e555643d8c3eb421f30855b36a0dc48"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
