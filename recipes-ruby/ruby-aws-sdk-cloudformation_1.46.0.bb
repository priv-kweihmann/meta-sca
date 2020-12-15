SUMMARY = "RubyGem: aws-sdk-cloudformation"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudFormation"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f0d5504d6247e802a31b706780477258"
SRC_URI[sha256sum] = "6745948f23f688e4929f0312a122fac2bb71e74f224c8c5dec6a74eb9e3b0082"

GEM_NAME = "aws-sdk-cloudformation"

inherit rubygems
