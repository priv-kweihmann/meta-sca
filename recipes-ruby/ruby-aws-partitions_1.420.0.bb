SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2dbbb47a5afae48c08bbee76a8549942"
SRC_URI[sha256sum] = "1dc710294e67a9067e0ed1bf35ec91e929e1b60f70ed97ef5927d9e11acded8c"

GEM_NAME = "aws-partitions"

inherit rubygems
