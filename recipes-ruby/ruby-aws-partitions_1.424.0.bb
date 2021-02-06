SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "18effe8f58dfbfb066a3b00a7b3fb3f1"
SRC_URI[sha256sum] = "17e78c5e468de094fec0d7b8de6865ad7dadaf6a94a483e110efc068efe8beb7"

GEM_NAME = "aws-partitions"

inherit rubygems
