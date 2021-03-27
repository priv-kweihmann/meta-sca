SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c347908828960dc7622b0e69bfeae2ab"
SRC_URI[sha256sum] = "c55e02e4c6ccca8bb3f878d02d3c64dcdf21e71c5c6dde9855d8b0c499062f5d"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
