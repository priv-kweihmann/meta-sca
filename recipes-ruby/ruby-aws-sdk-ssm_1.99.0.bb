SUMMARY = "RubyGem: aws-sdk-ssm"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Systems Manager (SSM) (Amazon SSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6dd5e1c07a9e9404fc2d4e067d96a705"
SRC_URI[sha256sum] = "0577f3e7462eef16d75435b7ae08b4915e74be4d413a2171cf8f9f68b3816d19"

GEM_NAME = "aws-sdk-ssm"

inherit rubygems
