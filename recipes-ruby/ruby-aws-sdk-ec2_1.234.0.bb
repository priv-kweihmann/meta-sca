SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fa68fc79e48537866cc2199f149c7b2a"
SRC_URI[sha256sum] = "e42f0a4a31b3fcaeae6bb6d4aa0170b611893f137223aec226e257e6e24698e6"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
