SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "ab2c08252f6d9ca542532b616585c7f8"
SRC_URI[sha256sum] = "15461b907d015e42bc2e33d0f5132e68119820f789073a4c4c6ec5561e3f5391"

GEM_NAME = "aws-partitions"

inherit rubygems
