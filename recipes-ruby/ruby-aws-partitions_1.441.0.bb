SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "3806ca4714f3937edc0c833ff673f144"
SRC_URI[sha256sum] = "e9d1e11004c0d8f9711d1d3c5278cc97fdca56d85dd1d17811eda60017ae291e"

GEM_NAME = "aws-partitions"

inherit rubygems
