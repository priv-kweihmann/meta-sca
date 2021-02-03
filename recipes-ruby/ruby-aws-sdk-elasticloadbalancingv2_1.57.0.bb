SUMMARY = "RubyGem: aws-sdk-elasticloadbalancingv2"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing (Elastic Load Balancing v2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "79245ffc09e37459fa6da41d68551274"
SRC_URI[sha256sum] = "80480fb6ab46ed3e8391c9e229efb5994d08e5a9a8ee4737418614a6f3eb1f09"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
