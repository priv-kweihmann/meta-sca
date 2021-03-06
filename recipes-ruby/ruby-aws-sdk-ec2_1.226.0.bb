SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1e465b09a99380dfe13b4331fcb5e455"
SRC_URI[sha256sum] = "49627e0c61833e74f0d1ca3652749ef20eb26d0a7f899c2c8804374d454d4375"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
