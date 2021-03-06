SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "76ba50bf0c2c2367a07fffd01a56ea64"
SRC_URI[sha256sum] = "7494d9ce0e8ac91dd9b5ff4a20eb7c148d2d101281bd05fb013f0dec5f27a720"

GEM_NAME = "aws-partitions"

inherit rubygems
