SUMMARY = "RubyGem: aws-sdk-cloudhsm"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudHSM (CloudHSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "56c5fb55cffeb0dba290b3848491086d"
SRC_URI[sha256sum] = "9511eb23a55644bccbcd7928876fa4060be779235cd354d55d045d6c8aba9ade"

GEM_NAME = "aws-sdk-cloudhsm"

inherit rubygems
