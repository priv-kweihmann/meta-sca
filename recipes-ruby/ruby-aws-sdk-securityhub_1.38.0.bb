SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d5b0933a3332e2e36cf9440652b6bf9e"
SRC_URI[sha256sum] = "5f1fc05c0c3f8cd3e6020efd77c271f223622ee6b3f64cd36664c184d42327da"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
