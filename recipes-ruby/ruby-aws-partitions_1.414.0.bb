SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "22852d399b0ee81533b67dc3ca8c0b9b"
SRC_URI[sha256sum] = "133d7ba9a5beb16203ced85c34ad494dce1ee923a7bb1871f86c14f63ef0c737"

GEM_NAME = "aws-partitions"

inherit rubygems
