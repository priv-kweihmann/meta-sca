SUMMARY = "RubyGem: aws-sdk-cloudhsmv2"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudHSM V2 (CloudHSM V2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "939048e5cff0b02fe835fe793fb58c89"
SRC_URI[sha256sum] = "e32eb026c15cd46554d986e28e6fea293dd57d89d2f40c004e26028b1a8d348b"

GEM_NAME = "aws-sdk-cloudhsmv2"

inherit rubygems
