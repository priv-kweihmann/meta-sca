SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3ac1c9de6f4aeaa032f805f684ef0293"
SRC_URI[sha256sum] = "a1646811854a48a57ec6e71ae794a10c1a6da329de063b22c131d003266990f6"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
