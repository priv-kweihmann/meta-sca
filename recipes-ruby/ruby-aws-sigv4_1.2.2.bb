SUMMARY = "RubyGem: aws-sigv4"
DESCRIPTION = "Amazon Web Services Signature Version 4 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-eventstream"

SRC_URI[md5sum] = "49e0836d3af6ff97d01e15977ff85b12"
SRC_URI[sha256sum] = "65438696f790a439447fb532921bf48f79166000904606cab950f4c0041a89d2"

GEM_NAME = "aws-sigv4"

inherit rubygems
