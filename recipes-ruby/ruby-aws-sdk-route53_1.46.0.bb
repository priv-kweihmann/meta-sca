SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "76aea91090a4b4cf4267d62c8309b0b2"
SRC_URI[sha256sum] = "e793d9d450b64641abe5bbfd4321238a7ea4db41818d64d5a8e5e6d4ed34b5cb"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
