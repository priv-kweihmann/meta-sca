SUMMARY = "RubyGem: aws-sdk-sns"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Notification Service (Amazon SNS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7a3edcbab8c875b08744a5e956521e4c"
SRC_URI[sha256sum] = "04a79867cac6afccbc33c5db59a1c90d4da80af07a27e497a1d38a1c0e8abd5e"

GEM_NAME = "aws-sdk-sns"

inherit rubygems
