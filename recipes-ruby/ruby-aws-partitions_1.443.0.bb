SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "410c12b7bb3c6625961ec44ef2db6723"
SRC_URI[sha256sum] = "e944adb54a39b12d5f8ed509c52f71f85dda973e8033eabc0575ec44c8d86a6f"

GEM_NAME = "aws-partitions"

inherit rubygems
