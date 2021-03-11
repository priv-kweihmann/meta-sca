SUMMARY = "RubyGem: aws-sdk-elasticloadbalancingv2"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing (Elastic Load Balancing v2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c50ee8a63cfda5d63e86b8098fea3aea"
SRC_URI[sha256sum] = "b5062682d3bb22c28581b1d538821107f474d86a3341d608a831e8b2f1b2139a"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
