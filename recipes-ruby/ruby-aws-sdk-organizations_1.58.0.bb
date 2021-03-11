SUMMARY = "RubyGem: aws-sdk-organizations"
DESCRIPTION = "Official AWS Ruby gem for AWS Organizations (Organizations)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3fc12502ac791ad653a90531fbefd857"
SRC_URI[sha256sum] = "cef670f0418bc59b45a5b2ac2fcf64e79485a1803aff629feefdc4646fc1124f"

GEM_NAME = "aws-sdk-organizations"

inherit rubygems
