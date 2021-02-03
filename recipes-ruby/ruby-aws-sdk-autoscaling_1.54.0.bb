SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1da1310ae13d24d7cc084a3b7c7c48e1"
SRC_URI[sha256sum] = "05f2bea81e0ef10c44c0c44397f0b02194840fab705d320152acd5b4ac7c0840"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
