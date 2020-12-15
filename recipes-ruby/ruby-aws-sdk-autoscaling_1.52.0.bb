SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7aa0ed0032c420cf75ebfb260e1ce7e8"
SRC_URI[sha256sum] = "7b8cee715127e7ef17fd80f8630742abd67607801260521f2778391da56f0d3a"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
