SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "399af7454f62196c4cedb56871aaa9bf"
SRC_URI[sha256sum] = "dbce40686fd14e9252ce74652d184554bbf9f773941795a6ea93ff5d8ceac938"

GEM_NAME = "aws-partitions"

inherit rubygems
