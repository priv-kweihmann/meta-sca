SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fbb009b6897919892bb726cffd838e7b"
SRC_URI[sha256sum] = "051f339369c20a5a680059df38134e606772133bfc89e19e7b15d5fb8d89f058"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
