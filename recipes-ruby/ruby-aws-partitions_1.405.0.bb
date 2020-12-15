SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "93461ff38d050f7f0426d20db4a17ac6"
SRC_URI[sha256sum] = "781554695c6785fbe4478ca2557d4b83cf12f34263293ceff68303455b889777"

GEM_NAME = "aws-partitions"

inherit rubygems
