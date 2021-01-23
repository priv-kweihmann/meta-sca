SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "8bed96e09d69d23855e757387ae46e48"
SRC_URI[sha256sum] = "f91f90d03b4e8fe64c38a26dedef615f527a476de80b4c0a7f76dfdcbb0e9c5c"

GEM_NAME = "aws-partitions"

inherit rubygems
