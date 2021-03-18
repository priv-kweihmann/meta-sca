SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "464328cb5bc70913cf5e727c0f624c18"
SRC_URI[sha256sum] = "814a96b7135e86a28eab0b8e148191fb1cf7e7c3d92e68c8ffdcd235025849c5"

GEM_NAME = "aws-partitions"

inherit rubygems
