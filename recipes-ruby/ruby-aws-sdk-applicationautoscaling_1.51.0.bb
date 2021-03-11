SUMMARY = "RubyGem: aws-sdk-applicationautoscaling"
DESCRIPTION = "Official AWS Ruby gem for Application Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a7abe8aaf3f6167cdaef5ff729a3f71c"
SRC_URI[sha256sum] = "d6594250212f93f0b90f16349809988ff921fa6b65b2e940fa0c47cf1a02e052"

GEM_NAME = "aws-sdk-applicationautoscaling"

inherit rubygems
