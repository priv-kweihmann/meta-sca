SUMMARY = "RubyGem: aws-sdk-route53resolver"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Resolver (Route53Resolver)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6588931aca6f0b27dd35a2ae2045b680"
SRC_URI[sha256sum] = "c71d3f134077ba477cf0f8479bb7716134d1058618f68635428396cf4cf175af"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
