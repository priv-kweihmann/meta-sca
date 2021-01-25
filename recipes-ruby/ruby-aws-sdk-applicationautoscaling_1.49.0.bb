SUMMARY = "RubyGem: aws-sdk-applicationautoscaling"
DESCRIPTION = "Official AWS Ruby gem for Application Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2782e4e24dc1405b0bdf81a30e24acf5"
SRC_URI[sha256sum] = "c4be4caa953c12fded924fd9f973cc3ed6e49930a5e2f32ead6b9c62316df407"

GEM_NAME = "aws-sdk-applicationautoscaling"

inherit rubygems
