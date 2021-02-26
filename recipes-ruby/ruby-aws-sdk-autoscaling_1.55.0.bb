SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "bff5830a715cccb9949d9102bb84b04f"
SRC_URI[sha256sum] = "3d1e09894b76c18423b1d57602c7c5aa7e2d9c5f25a40920f08b11b4452cac98"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
