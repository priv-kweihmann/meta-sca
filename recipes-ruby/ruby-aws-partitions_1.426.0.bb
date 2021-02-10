SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "3e7d940cf6efa5d8b7aab5ace9744c13"
SRC_URI[sha256sum] = "c9b375f6dff821e0bbfd6ad417f3081f66e4f5d43c4436629e2cc9e9ff5a385b"

GEM_NAME = "aws-partitions"

inherit rubygems
