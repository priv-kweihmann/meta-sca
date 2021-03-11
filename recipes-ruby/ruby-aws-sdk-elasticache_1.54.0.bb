SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4027fc27f63e8073e4642fe8abcdd3c8"
SRC_URI[sha256sum] = "ea33c9b541ea83f5844b48de30fd935a653a452c3d303e6d72dae633c8147616"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
