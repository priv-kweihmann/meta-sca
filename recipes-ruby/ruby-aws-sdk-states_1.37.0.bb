SUMMARY = "RubyGem: aws-sdk-states"
DESCRIPTION = "Official AWS Ruby gem for AWS Step Functions (AWS SFN)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9d88620d2a8014cc35a8ea651c78bcbb"
SRC_URI[sha256sum] = "e2370bf9f2f5af51aa2cb8a2cdb5238a0010196fb66dffbd4b3f4e26a3ceed12"

GEM_NAME = "aws-sdk-states"

inherit rubygems
