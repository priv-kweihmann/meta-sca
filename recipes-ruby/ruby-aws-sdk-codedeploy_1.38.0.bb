SUMMARY = "RubyGem: aws-sdk-codedeploy"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeDeploy (CodeDeploy)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "01b0d8b33cc6c6896626932990d9082e"
SRC_URI[sha256sum] = "448a1ea8369039e5ed1196afb858f7908eb95a5fd885fad3877e9ed321d8f984"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
