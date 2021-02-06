SUMMARY = "RubyGem: aws-sdk-organizations"
DESCRIPTION = "Official AWS Ruby gem for AWS Organizations (Organizations)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "5adc4b8079d883bf915e1226fe1c5a50"
SRC_URI[sha256sum] = "c3ee90eba23580bfc781b10d52f3cbd829309572779a6df755fc232a3e06ac61"

GEM_NAME = "aws-sdk-organizations"

inherit rubygems
