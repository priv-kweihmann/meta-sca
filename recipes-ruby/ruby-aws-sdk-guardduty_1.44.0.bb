SUMMARY = "RubyGem: aws-sdk-guardduty"
DESCRIPTION = "Official AWS Ruby gem for Amazon GuardDuty"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "aa8b3a47f07d6f545298fac940c4f056"
SRC_URI[sha256sum] = "099f3411e94a2788b4241a16c9c77b4c2e2c8f730b74ab7a28d0a90c841f2659"

GEM_NAME = "aws-sdk-guardduty"

inherit rubygems
