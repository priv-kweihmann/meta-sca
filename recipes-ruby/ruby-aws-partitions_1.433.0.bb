SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "a921bc28c4705ac6acde305a3c38b291"
SRC_URI[sha256sum] = "c8cfb2b904ff56dea6689ea45ddf5f33516118bb1b63c3438f8a0addda310921"

GEM_NAME = "aws-partitions"

inherit rubygems
