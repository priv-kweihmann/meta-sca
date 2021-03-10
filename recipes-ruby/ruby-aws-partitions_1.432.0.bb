SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "131e9dd31c300f708cefe662e6a8b4fe"
SRC_URI[sha256sum] = "ef7dba4202f68bd181be92d338ff216d63a1da45b682fe158ac3c3f760111f78"

GEM_NAME = "aws-partitions"

inherit rubygems
