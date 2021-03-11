SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "0295336e10c04378c57ac0228430e88f"
SRC_URI[sha256sum] = "e52b1fc527ce847a2c6799f465a1ca759727534da0c5f2df2deb8370b0d96aaa"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
