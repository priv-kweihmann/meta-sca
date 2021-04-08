SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "4cdee01581b6de888c91f629bdaa27e5"
SRC_URI[sha256sum] = "cd296ac69b146a9cb6c97f56d7196f2ceec7751c673bbdf641753ca8aa43a052"

GEM_NAME = "aws-partitions"

inherit rubygems
