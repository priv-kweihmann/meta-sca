SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "a1be2d5d67558e40568d92cb660b70d3"
SRC_URI[sha256sum] = "0493520011b4ba390088b80f12f3370f8ad5525c5abcf37dd6e26143fccb9c63"

GEM_NAME = "aws-partitions"

inherit rubygems
