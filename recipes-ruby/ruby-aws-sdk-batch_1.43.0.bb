SUMMARY = "RubyGem: aws-sdk-batch"
DESCRIPTION = "Official AWS Ruby gem for AWS Batch"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b8b27b1e51224450924a87cc99761048"
SRC_URI[sha256sum] = "7c46555192f5ff756a5071f1cde97ee14d2e04d216bbc02d11ac1685095a0093"

GEM_NAME = "aws-sdk-batch"

inherit rubygems
