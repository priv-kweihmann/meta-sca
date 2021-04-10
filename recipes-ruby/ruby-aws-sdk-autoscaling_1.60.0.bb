SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "405483e30ced0daa679752f8011c2774"
SRC_URI[sha256sum] = "b757f3083832462d40a22bcf47b804d801f284486bb0a9588d69c17e27bfd256"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
