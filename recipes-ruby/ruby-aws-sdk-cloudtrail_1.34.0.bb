SUMMARY = "RubyGem: aws-sdk-cloudtrail"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudTrail (CloudTrail)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "480adfc40cf69f3ad5c6ab18f08809ab"
SRC_URI[sha256sum] = "abbf89e423219fafb3d7ae41e00151d7ee1ad988b3d3167cc507c62b94335d05"

GEM_NAME = "aws-sdk-cloudtrail"

inherit rubygems
