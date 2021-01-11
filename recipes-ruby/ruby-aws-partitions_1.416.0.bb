SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "df4ec9e2695fa5421cedb72fee1e6486"
SRC_URI[sha256sum] = "2c02c93baf9416cc01d0b5c717da2f60504ed32aaee4017205941be75b0f5934"

GEM_NAME = "aws-partitions"

inherit rubygems
