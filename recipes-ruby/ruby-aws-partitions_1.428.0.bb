SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "a8eb2a377be2f3378fd3f242be46e008"
SRC_URI[sha256sum] = "48de369ff76de43e33e12daab8c958108abd768942712c83d3f36e1829bd3b8f"

GEM_NAME = "aws-partitions"

inherit rubygems
