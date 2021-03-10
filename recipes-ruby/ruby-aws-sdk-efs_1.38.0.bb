SUMMARY = "RubyGem: aws-sdk-efs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic File System (EFS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b817bd4f5165d08984718672fd3265fc"
SRC_URI[sha256sum] = "9cf61f9f5ab71a421ac7dfa8765ea858f7bfccf2a592e276549bee52a17eb594"

GEM_NAME = "aws-sdk-efs"

inherit rubygems
