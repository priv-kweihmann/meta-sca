SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "ca4ddec5ef5927e48ac252c9c08003d2"
SRC_URI[sha256sum] = "c0a81fac26786b8be22b22d72eb6b12b3cc7706c7d169104adfc5efae55f60d6"

GEM_NAME = "aws-partitions"

inherit rubygems
