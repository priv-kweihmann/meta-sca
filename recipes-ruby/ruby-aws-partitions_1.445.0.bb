SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "a252ea7e0f53fc1f437292d5ffd2c260"
SRC_URI[sha256sum] = "327712e94ce9a24fa904466a833fd520e21daf64c3c0b9e92d997976376072fb"

GEM_NAME = "aws-partitions"

inherit rubygems
