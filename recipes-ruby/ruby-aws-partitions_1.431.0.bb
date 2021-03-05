SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "cf93d88a599ea7ab48eeb5fb4dcb9f62"
SRC_URI[sha256sum] = "eb1bc4d41f246d1e39ec602bfcfa3a350de2f5b295ada575549b3daa2c563e32"

GEM_NAME = "aws-partitions"

inherit rubygems
