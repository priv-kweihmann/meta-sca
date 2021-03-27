SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f4346594547093fed9bef3e148c4c94f"
SRC_URI[sha256sum] = "e3efad633f1f39b101d98bab103a8d9b8cc56a9292f741cc588d24273cc5f8b0"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
