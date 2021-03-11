SUMMARY = "RubyGem: aws-sdk-ecs"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Service (Amazon ECS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "23507aa2338548acefa0acb46d916d33"
SRC_URI[sha256sum] = "e5164e0ca2b944e043e1d277a0b315345b9d17517f13dee291c0c696bb4913eb"

GEM_NAME = "aws-sdk-ecs"

inherit rubygems
