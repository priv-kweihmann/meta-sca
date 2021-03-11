SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "339333ba4a11542b745be8984f0e7599"
SRC_URI[sha256sum] = "946f2fc7905ab050cfd948fa0d2dfff6578c3e47a385979bded1419b45cc057e"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
