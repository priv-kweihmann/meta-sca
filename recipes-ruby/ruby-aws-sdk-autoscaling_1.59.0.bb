SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "18e00870f198ac0599c171aec7d6e1c8"
SRC_URI[sha256sum] = "7993fe5ddb5a95aa8fd1e8567c89d080980b40b77556b5238a399728a283262f"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
