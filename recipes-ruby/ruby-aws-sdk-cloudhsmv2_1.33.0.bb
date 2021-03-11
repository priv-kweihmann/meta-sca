SUMMARY = "RubyGem: aws-sdk-cloudhsmv2"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudHSM V2 (CloudHSM V2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3dee6b27d9d608863402eadc7e2c55eb"
SRC_URI[sha256sum] = "7a7a06c174a7c4c1fe386d6f0ba056df38d17ad9497826cc239987464e1bbee4"

GEM_NAME = "aws-sdk-cloudhsmv2"

inherit rubygems
