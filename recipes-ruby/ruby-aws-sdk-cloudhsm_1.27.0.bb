SUMMARY = "RubyGem: aws-sdk-cloudhsm"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudHSM (CloudHSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "66854767b72583c8087163329c4eae27"
SRC_URI[sha256sum] = "53a8ae7b08c826da814e18e620cda1899ed9c8b0d4024f1b9fe9923767434695"

GEM_NAME = "aws-sdk-cloudhsm"

inherit rubygems
