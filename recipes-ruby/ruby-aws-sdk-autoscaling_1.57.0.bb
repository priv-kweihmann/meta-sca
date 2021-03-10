SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9550530e3f173ef0e2aaa8da75085456"
SRC_URI[sha256sum] = "676b6e70c0f7236d4f4c24bf557960b5d2ccc6909113b2db25e95c65197aa79e"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
