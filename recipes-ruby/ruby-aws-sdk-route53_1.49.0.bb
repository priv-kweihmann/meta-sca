SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "538c3f7ed6fcc3e120e9c3f83da0b112"
SRC_URI[sha256sum] = "91731c7da583ecb9198811a4c8df3c25dc319a2eca9a8e18c350bd41cee7ddd2"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
