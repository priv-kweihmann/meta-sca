SUMMARY = "RubyGem: aws-sdk-secretsmanager"
DESCRIPTION = "Official AWS Ruby gem for AWS Secrets Manager"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4e948f7078635dbf43f7ab49f7da2f7a"
SRC_URI[sha256sum] = "718438609e3353a92dc5aa45c36c2ac016f96d1ad03c4f07f49c56117d1a7d76"

GEM_NAME = "aws-sdk-secretsmanager"

inherit rubygems
