SUMMARY = "RubyGem: aws-sdk-elasticloadbalancingv2"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing (Elastic Load Balancing v2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "17d836d6f9e6ad88db8670dbc0537819"
SRC_URI[sha256sum] = "f07eaefe156b43c5ef880f52adc6406de438ecc4b5aa1784abcc5db361c6d51c"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
