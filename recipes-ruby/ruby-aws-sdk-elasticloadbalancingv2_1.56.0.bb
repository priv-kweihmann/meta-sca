SUMMARY = "RubyGem: aws-sdk-elasticloadbalancingv2"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing (Elastic Load Balancing v2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "dcdadbb7b0bb11302f248fc428227ec6"
SRC_URI[sha256sum] = "40a591d0bba1d39a9bc0206b5aeca58180023fc7b0dc0a0ef4feab582fa5b917"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
