SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "a52ab58198ed26298185e7d8425177cd"
SRC_URI[sha256sum] = "321b712dc9dd70486f7d6e435333de73463cd2a59ea244c09b550460fc8c934b"

GEM_NAME = "aws-partitions"

inherit rubygems
