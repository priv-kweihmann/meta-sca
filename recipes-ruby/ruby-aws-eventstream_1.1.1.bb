SUMMARY = "RubyGem: aws-eventstream"
DESCRIPTION = "Amazon Web Services event stream library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "15511340519ce63d360f33d8ae2c34a4"
SRC_URI[sha256sum] = "034a72c408c77fc8d08132897be5025dcd414cd891ecd758b11465376389d349"

GEM_NAME = "aws-eventstream"

inherit rubygems
