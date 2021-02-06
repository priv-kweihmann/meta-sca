SUMMARY = "RubyGem: aws-sdk-elasticloadbalancingv2"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing (Elastic Load Balancing v2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "ffa6c33147b0cc04d006be7bffec56a5"
SRC_URI[sha256sum] = "0f714640e696b4305cfffc860490e320c45a2c69c7c61e25c09928a89eace9be"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
