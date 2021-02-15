SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "6524d7aaa9e81cc1deda61d298364f99"
SRC_URI[sha256sum] = "dfe5460fad0233cbd641e98b09f997356e21244d85f8238c2377353eb1e7edec"

GEM_NAME = "aws-partitions"

inherit rubygems
