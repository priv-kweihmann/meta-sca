SUMMARY = "RubyGem: aws-sdk-cloudformation"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudFormation"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "70eb233a9df8aecb5c465dc5c8267bbf"
SRC_URI[sha256sum] = "6e604090efdaf08cdc885b45c0a742e4e6e26b7a0fb16f4c920489521965669d"

GEM_NAME = "aws-sdk-cloudformation"

inherit rubygems
