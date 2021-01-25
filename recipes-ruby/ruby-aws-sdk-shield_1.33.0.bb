SUMMARY = "RubyGem: aws-sdk-shield"
DESCRIPTION = "Official AWS Ruby gem for AWS Shield"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d41fcb4e975fb906a5ec0d15ca0ba830"
SRC_URI[sha256sum] = "541185c275efa34eaad15bc114932b82629df455db459fea27adaf9d7b161169"

GEM_NAME = "aws-sdk-shield"

inherit rubygems
