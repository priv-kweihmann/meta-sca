SUMMARY = "RubyGem: aws-sdk-ecs"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Service (Amazon ECS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "215039e72439d91e76647fcb5243a9d8"
SRC_URI[sha256sum] = "4c782561fd49ae8d2abc20d96d85fd607308c6c4a0e0cf2ca82c7dcae46f9c13"

GEM_NAME = "aws-sdk-ecs"

inherit rubygems
