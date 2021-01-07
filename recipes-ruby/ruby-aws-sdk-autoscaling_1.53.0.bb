SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "c6b8be2be8aafdd857bc6d742f2f03c4"
SRC_URI[sha256sum] = "562f42896e678a8c114b42f26936a108e95a5166f339ee3587c7f6dae4f26eee"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
