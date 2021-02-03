SUMMARY = "RubyGem: aws-sdk-cloudhsm"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudHSM (CloudHSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8442baf25cee394614b0f03ab1dc8d2e"
SRC_URI[sha256sum] = "0e531e88d9f28c0e03a35207b57cbdc85142379b9d33ca085ca6419501af9128"

GEM_NAME = "aws-sdk-cloudhsm"

inherit rubygems
