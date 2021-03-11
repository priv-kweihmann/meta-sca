SUMMARY = "RubyGem: aws-sdk-cloudhsm"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudHSM (CloudHSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a22725345ed3316ba655a7b66c2fd723"
SRC_URI[sha256sum] = "f406db5747bafaae0cd40124dec158735dd49355b650b01f30fc91ababa40571"

GEM_NAME = "aws-sdk-cloudhsm"

inherit rubygems
