SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "35f664b87c844eabf34b584311b63506"
SRC_URI[sha256sum] = "a20b9fc1a9b2ed32612b1102cec46cf49c500c4bac48761c79d198ee76e5a528"

GEM_NAME = "aws-partitions"

inherit rubygems
