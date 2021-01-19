SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "3f13a940f568b2733bba83116ab35adf"
SRC_URI[sha256sum] = "408edb91d50ea6a049c46139cf6c9ff3a958152b0770de24c0f9c76bbdd02eb6"

GEM_NAME = "aws-partitions"

inherit rubygems
