SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "a577f4f65cd8f4a3d14de0dfd6e82784"
SRC_URI[sha256sum] = "7dabe2c7a10febd02f4b29d24fd8b9bf3d4154bc104e903025557511813a868e"

GEM_NAME = "aws-partitions"

inherit rubygems
