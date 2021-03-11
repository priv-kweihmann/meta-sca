SUMMARY = "RubyGem: aws-sdk-route53domains"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Domains"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2810c4319c90524cb296ee139cb93a53"
SRC_URI[sha256sum] = "2652e73281dc07da720c87b08a226cab696dac07137bb36116329bf14bbc7ed3"

GEM_NAME = "aws-sdk-route53domains"

inherit rubygems
