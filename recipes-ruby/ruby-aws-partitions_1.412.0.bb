SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e8b0e3abb11358223ee764286cc53e39"
SRC_URI[sha256sum] = "72f05ebd249c0c09837a67d14bbcfc5be121df7a74ff66cd30c98f9dcd161580"

GEM_NAME = "aws-partitions"

inherit rubygems
