SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "4ecce6a4d68b7f7c29de1ac8fbbe7a69"
SRC_URI[sha256sum] = "2965722e349c5d880e95819bcc1ecd610c3845123bd4dcd61323feae961a4106"

GEM_NAME = "aws-partitions"

inherit rubygems
