SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4ffb437e6de32f7ae2c9bd4f1a576106"
SRC_URI[sha256sum] = "7233cc97e4faf94663a1f22c8c6e6eafa882220e54ac1a2d3f907d303e1f2676"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
