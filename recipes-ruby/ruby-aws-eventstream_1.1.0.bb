SUMMARY = "RubyGem: aws-eventstream"
DESCRIPTION = "Amazon Web Services event stream library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "50f4916f0e7bdc4527f30fe02ad9197f"
SRC_URI[sha256sum] = "65b3b364861f4e2663359793e7632da70be9418d0d1f1b9bcbb365ec8db11764"

GEM_NAME = "aws-eventstream"

inherit rubygems
