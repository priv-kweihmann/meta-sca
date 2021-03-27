SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "af5f0ae6172b22f0d0f8df928cdfab4b"
SRC_URI[sha256sum] = "8e4465a6c991fb3cd6e0a39f0a72019e522afbc8002939587bc68ae7144bc0be"

GEM_NAME = "aws-partitions"

inherit rubygems
