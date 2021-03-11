SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f819658c9d3bf8cd151a5e410c0f7c3e"
SRC_URI[sha256sum] = "4d40a3d580a4ce821b8f69ec3b3da8becad2b109e15689d46085f9d154e71752"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
