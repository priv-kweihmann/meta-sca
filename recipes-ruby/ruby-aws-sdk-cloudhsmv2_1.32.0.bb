SUMMARY = "RubyGem: aws-sdk-cloudhsmv2"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudHSM V2 (CloudHSM V2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4ee1ab927e83a45f76337c3e438d22ee"
SRC_URI[sha256sum] = "ba29fc80570a6d2d516b4cb2e1d771b5b0350a793163995c8a3bbf653bc06d8e"

GEM_NAME = "aws-sdk-cloudhsmv2"

inherit rubygems
