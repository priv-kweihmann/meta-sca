SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "cf9693a231f82a9e56c560e0025795b1"
SRC_URI[sha256sum] = "d8d37b82329179b1518d32d7d0113d26c47ef3c3cdbc02686b7e4a4529ff8b56"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
